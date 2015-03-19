package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.ContactBean;


public class InfosContact{

	ContactBean contact;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";

	public InfosContact(){
	contact = new ContactBean();
	}

	
	int etr_univ = 0; 
	int etr_entreprise = 0; 
	int id_contact=0;
	
	public ContactBean infoContact(int id){
		contact = new ContactBean();
		try{
			id_contact=id;
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM contact "+ "WHERE id_contact = "+id_contact+";");
			
			while(resultat.next()){
				contact.setPrenom(resultat.getString("prenom"));
				contact.setNom(resultat.getString("nom"));
				contact.setFonction(resultat.getString("fonction"));
				contact.setMail(resultat.getString("mail"));
				contact.setTel(resultat.getString("tel"));
			}	
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return contact;
	}
}