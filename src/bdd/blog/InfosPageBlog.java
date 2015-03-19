package bdd.blog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.blog.PageBean;

public class InfosPageBlog {

	PageBean pb;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";
	
	public InfosPageBlog() {
		pb = new PageBean();
	}
	
	public PageBean getInfos(HttpServletRequest request){
		return pb;
	}
	
	public PageBean getInfosByPays(String pays){
		pb = new PageBean();
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM article a, entreprise e, universite u, etudiant et"+ 
											"WHERE pays = '"+pays+" AND a.etr_etud = et.id_etud AND;");
			
//			while(resultat.next()){
//				if (!pb.getPays().contains(resultat.getString("pays"))) {
//					pb.getFlag_path().add(resultat.getString("photo1"));
//					pb.getImg_path().add(resultat.getString("photo2"));
//					pb.getPays().add(resultat.getString("pays"));
//				}
//			}
//			
//			resultat.close();
//			
//			resultat = instruction.executeQuery("SELECT * " +"FROM entreprise "+ "WHERE pays = '"+pays+";");
//			
//			while(resultat.next()){
//				if (!pb.getPays().contains(resultat.getString("pays"))) {
//					pb.getFlag_path().add(resultat.getString("photo1"));
//					pb.getImg_path().add(resultat.getString("photo2"));
//					pb.getPays().add(resultat.getString("pays"));
//				}
//			}
			
			resultat.close();
			
			instruction.close();
			connexion.close();
			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return pb;
	}
	
	public void setInfos(PageBean pb){
		System.out.println("Article modifié");
	}
	
	public void deleteArticle(int id){
		System.out.println("suppression de l'article d'id = "+id);
	}
}
