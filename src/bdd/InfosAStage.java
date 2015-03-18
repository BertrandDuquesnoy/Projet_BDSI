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
		//TODO: requetes listant les infos de AStageBean pour tous les stages effectués
		
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM entreprise en, etudiant et "+"WHERE en.id_entreprise = et.etr_entrprise "+";");
			
			while(resultat.next()){
				as.setAnnee((ArrayList<String>)resultat.getArray("annee"));
				as.setPays((ArrayList<String>)resultat.getArray("pays"));
				as.setVille((ArrayList<String>)resultat.getArray("ville"));
				as.setEntreprise((ArrayList<String>)resultat.getArray("nom"));
				as.setAdresse((ArrayList<String>)resultat.getArray("adresse"));
				as.setDomaine((ArrayList<String>)resultat.getArray("domaine"));
				as.setLangue((ArrayList<String>)resultat.getArray("langue"));
				as.setLogo_path((ArrayList<String>)resultat.getArray("logo_path"));

			}
			
			ResultSet resultat2 = instruction.executeQuery("SELECT * " +"FROM etudiant et , profil p "+"WHERE et.etr_profil = p.id_profil "+";");
			
			while(resultat2.next()){
				as.setNom((ArrayList<String>)resultat.getArray("nom"));
				as.setPrenom((ArrayList<String>)resultat.getArray("prenom"));

			}
		
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return as;
	}
}
