package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import beans.map.PointCarteBean;

public class PointCarte {

	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";
	PointCarteBean pcb;
	
	public PointCarte() {
		pcb = new PointCarteBean();
	}
	
	public PointCarteBean getInfos(){
		//TODO: Requêtes pour récupérer toutes les universités, stages et ddiplomes avec les infos demandées dans les beans correspondants
		pcb = new PointCarteBean();
		int id_pcb=0;
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			//on recupere le lien concerant les aides financieres pour partir etudier a l'etranger
			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM universite u, lien l "+"WHERE l.etr_univ = u.id_univ AND id = "+id_pcb+";");
			while(resultat.next()){
				pcb.setTitre(resultat.getString("nom"));
				pcb.setDescription(resultat.getString("description"));
				pcb.setLien(resultat.getString("l_web"));
				pcb.setAdresse(resultat.getString("adresse"));
				pcb.setType("universit�");
			}
			
			ResultSet resultat2 = instruction.executeQuery("SELECT * " + "FROM entreprise ent, lien l "+"WHERE l.etr_entreprise = ent.id_entreprise AND id = "+id_pcb+";");
			while(resultat.next()){
				pcb.setTitre(resultat.getString("nom"));
				pcb.setDescription(resultat.getString("domaine"));
				pcb.setLien(resultat.getString("l_web"));
				pcb.setAdresse(resultat.getString("adresse"));
				pcb.setType("entreprise");
			}
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}

		
		return pcb;
	}
	

	
}
