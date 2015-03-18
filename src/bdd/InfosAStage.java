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

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM entreprise "+ "WHERE id_entreprise = "+id_Astage+";");
			
			while(resultat.next()){
				as.setNoms((ArrayList<String>)resultat.getArray("nom"));
				as.setDuree((ArrayList<String>)resultat.getArray("logo_path"));
				as.setAnnee((ArrayList<String>)resultat.getArray("logo_path"));
				as.setPays((ArrayList<String>)resultat.getArray("pays"));
				as.setNbStages(resultat.getInt("logo_path"));
				as.setEntreprise((ArrayList<String>)resultat.getArray("logo_path"));




			}
		
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return as;
	}
}
