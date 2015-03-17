// cette classe ne sert à rien car les infos sont insérées "en dur" sur la page donc pas besoin de requêtes ...
package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import beans.PresentationBean;

public class InfosPresentation {

	PresentationBean presBean;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";
	
	public InfosPresentation() {
		presBean = new PresentationBean();
	}
	
	public PresentationBean getInfos(HttpServletRequest request){
		//TODO: RequÃªte SQL pour les champs de presBean
		// On va chercher oÃ¹ ces champs ??
		
		int id_pres=0;
				try{
					Class.forName(pilote);

					Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

					Statement instruction = connexion.createStatement();

					//on recupere le lien concerant les aides financieres pour partir etudier a l'etranger
					ResultSet resultat = instruction.executeQuery("SELECT pays " +"FROM universite "+"WHERE id = "+id_pres+";");
					while(resultat.next()){
						presBean.setPays((ArrayList<String>) resultat.getArray("pays"));
					}
			
				}
				catch (Exception e){

					System.out.println("echec pilote : "+e);
				}
		
		
		return presBean;
	}
}
