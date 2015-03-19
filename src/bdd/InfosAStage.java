package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import beans.AStageBean;

public class InfosAStage {

	AStageBean as;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";

	
	public InfosAStage() {
		as = new AStageBean();
	}
	
	int id_Astage = 0;

	public AStageBean getInfos(){
		as = new AStageBean();
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT et.* " +"FROM entreprise en, etudiant et "+"WHERE en.id_entreprise = et.etr_entreprise AND et.etr_entreprise != 0"+";");
			
			while(resultat.next()){
				as.getAnnee().add(resultat.getString("annee"));
				as.getPays().add(resultat.getString("pays"));
				as.getVille().add(resultat.getString("ville"));
				as.getEntreprise().add(resultat.getString("nom"));
				as.getAdresse().add(resultat.getString("adresse"));
				as.getDomaine().add(resultat.getString("domaine"));
				as.getLangue().add(resultat.getString("langue"));
				as.getLogo_path().add(resultat.getString("logo_path"));

			}
			resultat.close();
			ResultSet resultat2 = instruction.executeQuery("SELECT p.nom, p.prenom " +"FROM etudiant et , profil p "+"WHERE et.etr_profil = p.id_profil AND et.etr_entreprise != 0 "+";");
			
			int i = 0;
			while(resultat2.next()){
				as.getNom().set(i, resultat2.getString("nom"));
				as.getPrenom().set(i++, resultat2.getString("prenom"));

			}
			resultat2.close();
			instruction.close();
			connexion.close();
			
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("echec pilote : "+e);
		}
		return as;
	}
}
