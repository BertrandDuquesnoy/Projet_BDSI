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
	ArrayList<PointCarteBean> pcb_list;

	
	public PointCarte() {
		pcb = new PointCarteBean();
		pcb_list = new ArrayList<PointCarteBean>();

	}
	
	public ArrayList<PointCarteBean> getInfos(){
		//TODO: Requêtes pour récupérer toutes les universités, stages et ddiplomes avec les infos demandées dans les beans correspondants
		pcb = new PointCarteBean();
		pcb_list = new ArrayList<PointCarteBean>();
		int id_pcb=0;
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			//on recupere le lien concerant les aides financieres pour partir etudier a l'etranger
			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM universite u, lien l "+"WHERE l.etr_univ = u.id_univ" +";");
			while(resultat.next()){
				pcb = new PointCarteBean();
				pcb.setTitre(resultat.getString("nom"));
				pcb.setDescription(resultat.getString("description"));
				pcb.setLien(resultat.getString("l_web"));
				pcb.setAdresse(resultat.getString("adresse"));
				pcb.setType("universit�");
				pcb_list.add(pcb);
				
			}
			
			ResultSet resultat2 = instruction.executeQuery("SELECT * " + "FROM entreprise ent, lien l "+"WHERE l.etr_entreprise = ent.id_entreprise"+";");
			while(resultat.next()){
				pcb = new PointCarteBean();
				pcb.setTitre(resultat2.getString("nom"));
				pcb.setDescription(resultat2.getString("domaine"));
				pcb.setLien(resultat2.getString("l_web"));
				pcb.setAdresse(resultat2.getString("adresse"));
				pcb.setType("entreprise");
				pcb_list.add(pcb);

			}
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}

		
		return pcb_list;
		
	
	}
	

	
}

