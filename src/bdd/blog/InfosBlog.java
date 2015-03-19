package bdd.blog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.blog.BlogBean;

public class InfosBlog {
	
	BlogBean bb;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";
	
	public InfosBlog() {
		bb = new BlogBean();
	}
	
	public BlogBean getInfos(HttpServletRequest request){
		bb = new BlogBean();
		//TODO: Requêtes qui renvoient les différentes catégories et leurs id
		return bb;
	}
	
	public BlogBean getInfosByPays(String pays){
		bb = new BlogBean();
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM universite "+ "WHERE pays = '"+pays+";");
			
			while(resultat.next()){
				if (!bb.getPays().contains(resultat.getString("pays"))) {
					bb.getFlag_path().add(resultat.getString("photo1"));
					bb.getImg_path().add(resultat.getString("photo2"));
					bb.getPays().add(resultat.getString("pays"));
				}
			}
			
			resultat.close();
			
			resultat = instruction.executeQuery("SELECT * " +"FROM entreprise "+ "WHERE pays = '"+pays+";");
			
			while(resultat.next()){
				if (!bb.getPays().contains(resultat.getString("pays"))) {
					bb.getFlag_path().add(resultat.getString("photo1"));
					bb.getImg_path().add(resultat.getString("photo2"));
					bb.getPays().add(resultat.getString("pays"));
				}
			}
			
			resultat.close();
			
			instruction.close();
			connexion.close();
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return bb;
	}
	
	public void setInfos(BlogBean bb){
		//TODO: Requêtes de mises à jour de la BDD à partir du bean bb
	}

}
