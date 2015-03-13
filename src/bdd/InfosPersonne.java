package bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.PersonBean;

public class InfosPersonne{

	PersonBean personne;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";

	public InfosPersonne(){
		personne = new PersonBean();
	}

	int id_personne = 0; 
	
	public PersonBean infoPersonne(HttpServletRequest request){
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM profil "+ "WHERE id_profil = "+id_personne+";");
			
			while(resultat.next()){
				personne.setPrenom(resultat.getString("prenom"));
				personne.setNom(resultat.getString("nom"));
				personne.setFonction(resultat.getString("fonction"));
				personne.setMail(resultat.getString("mail"));
			}
			
			//On ne peut pas avoir la coloration d'un étudiant avec LDAP :(
			ResultSet resultat2 = instruction.executeQuery("SELECT coloration " +"FROM etudiant "+ "WHERE id_etud = "+id_personne+";");
			while(resultat2.next()){
				personne.setMail(resultat2.getString("coloration"));				
			}
			
			
			
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return personne;
	}
}