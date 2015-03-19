package bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.CreationPartenaireBean;


public class InfosCreationPartenaire{

	CreationPartenaireBean newP;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";

	public InfosCreationPartenaire(){
		newP = new CreationPartenaireBean();
	}

	public CreationPartenaireBean infoCreationPartenaire(){
		newP = new CreationPartenaireBean();
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM profil "+ ";");
			
			while(resultat.next()){
			
			}
			
			//On ne peut pas avoir la coloration d'un étudiant avec LDAP :(
			
			
			
			
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return newP;
	}
}
