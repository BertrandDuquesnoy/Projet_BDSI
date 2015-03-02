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

	public PersonBean infoPersonne(HttpServletRequest request){
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM profil "+ ";");
			while(resultat.next()){
				personne.setPrenom(resultat.getString("prenom"));
				personne.setNom(resultat.getString("nom"));
				personne.setAnnee(resultat.getString("promo"));
			}
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return personne;
	}
}