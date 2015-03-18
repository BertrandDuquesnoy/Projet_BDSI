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
	String nom="null";
	String pays="null";
	String adresse="null";
	String ville="null";
	String logo_path="null";
	String type="null";
	String langue="null";
	String date_creation="null";
	String description="null";
	String doub_dip="";
	int note=0;
	int nb_etudiant=0;
	
	public CreationPartenaireBean infoCreationPartenaire(String nom,String pays,String adresse,String ville,String logo_path,String type,
			String langue,String date_creation,String description,String doub_dip,int nb_etudiant){
		
		nom=nom; pays=pays; adresse=adresse; ville=ville; logo_path=logo_path; type=type; langue=langue; date_creation=date_creation;
		description=description; doub_dip=doub_dip; nb_etudiant=nb_etudiant;
		
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			instruction.executeUpdate("INSERT INTO universite "+"VALUES ('', "+nom+", "+pays+", "+adresse+", "+ville+", "+logo_path+", "+type+
					", "+langue+", "+date_creation+", 0, "+nb_etudiant+", "+description+", "+doub_dip+")");
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return newP;
	}
}
