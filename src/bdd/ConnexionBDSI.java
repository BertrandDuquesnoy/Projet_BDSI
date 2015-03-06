package bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class ConnexionBDSI{

public static void main(String[] args){

	String pilote = "com.mysql.jdbc.Driver";

	try{
		Class.forName(pilote);
 
		Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+"bdsi_sie1","sie1","sie1");
 
		Statement instruction = connexion.createStatement();
 
		ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM testEtudiant "+ ";");
		while(resultat.next()){
			
			System.out.println("---------------------------");
			System.out.println("Prenom : "+resultat.getString("prenom"));
			System.out.println("Nom : "+resultat.getString("nom"));
			System.out.println("Promo : "+resultat.getString("promo"));

		}
	}
	catch (Exception e){

		System.out.println("echec pilote : "+e);
	}

	}
}