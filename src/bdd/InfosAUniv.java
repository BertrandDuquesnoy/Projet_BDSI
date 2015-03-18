package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import beans.ADDBean;
import beans.AUnivBean;

public class InfosAUniv {
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";

	AUnivBean av;
	
	public InfosAUniv() {
		av = new AUnivBean();
	}
	 int id_AUniv=0;
	 
	public AUnivBean getInfos(){
		//TODO: requetes listant les infos de AUnivBean pour tous les stages effectués
		
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM universite "+ "WHERE id_univ = "+id_AUniv+";");
			
			while(resultat.next()){
				av.setPays((ArrayList<String>)resultat.getArray("pays"));
				av.setLogo_path((ArrayList<String>)resultat.getArray("logo_path"));
			}
		
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return av;
	}
}
