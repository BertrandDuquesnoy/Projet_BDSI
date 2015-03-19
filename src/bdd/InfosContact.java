package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	public ArrayList<ContactBean> infoContact(){
		ArrayList<ContactBean> list = new ArrayList<ContactBean>();
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM contact ;");
			
			while(resultat.next()){
				contact = new ContactBean();
				contact.setPrenom(resultat.getString("prenom"));
				contact.setNom(resultat.getString("nom"));
				contact.setFonction(resultat.getString("fonction"));
				contact.setMail(resultat.getString("mail"));
				contact.setTel(resultat.getString("tel"));
				list.add(contact);
			}	
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return list;
	}
}