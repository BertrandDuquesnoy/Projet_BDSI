package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.DoubleDiplomeBean;



public class InfosDoubleDiplomes {
	
	DoubleDiplomeBean ddBean;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";
	
	
	
	public InfosDoubleDiplomes(){
		ddBean = new DoubleDiplomeBean();
	}
	
	int id_dd = 0;
	
	public DoubleDiplomeBean getInfos(HttpServletRequest request){
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM universite "+"WHERE id_univ = "+id_dd+";");
			while(resultat.next()){
				
				ddBean.setPays(resultat.getString("pays"));
				ddBean.setVille(resultat.getString("ville"));
				ddBean.setAdresse(resultat.getString("adresse"));
				ddBean.setLogo_path(resultat.getString("logo_path"));
				ddBean.setFacebook_link(resultat.getString("facebook_link"));
				ddBean.setTwitter_link(resultat.getString("twitter_link"));
				ddBean.setLinkedin_link(resultat.getString("linkedin_link"));
				ddBean.setNote(resultat.getInt("note"));
				ddBean.setNbEtudiant(resultat.getInt("nb_etudiant"));
				
			}
			
			ResultSet resultat2 = instruction.executeQuery("SELECT * " +"FROM liens "+ "WHERE id_lien = "+id_dd+";");
			while(resultat2.next()){
				
				ddBean.setUrl(resultat2.getString("url"));	
			}
			
			ResultSet resultat3 = instruction.executeQuery("SELECT * " +"FROM contact "+ "WHERE id_contact = "+id_dd+";");
			while(resultat3.next()){
				
				ddBean.setTel(resultat3.getString("tel"));	
			}
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return ddBean;
	}
	
	
	
}
