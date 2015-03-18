package bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import beans.ADDBean;

// ADD = accueil double diplome
// nom et logo
public class InfosADD {

	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";

	ADDBean add;
	
	public InfosADD() {
		add = new ADDBean();
	}
	
	int id_ADD = 0;
	
	public ADDBean getInfos(HttpServletRequest request){
		//TODO: requetes listant les infos de ADDBean pour tous les stages effectués
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM universite "+ "WHERE id_univ = "+id_ADD+";");
			
			while(resultat.next()){
				add.setDd_nom((ArrayList<String>)resultat.getArray("nom"));
				add.setLogo_path((ArrayList<String>)resultat.getArray("logo_path"));
			}
		
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return add;
	}

}
