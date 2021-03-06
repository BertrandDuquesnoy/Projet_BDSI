package bdd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpServletRequest;

import beans.EtudiantBean;
import beans.PersonBean;
import beans.UniversityBean;

public class InfosUniversity {

	UniversityBean univ;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";
	
	public InfosUniversity(){
		this.univ = new UniversityBean();
	}
	
	int id_dd=0;
	
	public UniversityBean getinfos(int id){
		univ = new UniversityBean();
		id_dd = id;
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			//note et nbEtudiant sont des ints, so ?? et l'id
			ResultSet res1 = instruction.executeQuery("SELECT * " +"FROM universite "+"WHERE id_univ = "+id_dd+";");
			while(res1.next()){
				univ.setNom(res1.getString("nom"));
				univ.setPays(res1.getString("pays"));
				univ.setVille(res1.getString("ville"));
				univ.setAdresse(res1.getString("adresse"));
				univ.setLogo_path(res1.getString("logo_path"));
				univ.setType(res1.getString("type"));
				univ.setLangue(res1.getString("langue"));
				univ.setDateFondation(res1.getString("date_creation"));
				univ.setNote(res1.getFloat("note"));
				univ.setNbEtudiants(res1.getInt("nb_etudiant"));
				univ.setDescription(res1.getString("description"));
				univ.setL_formation(res1.getString("l_formation"));

				
			}
			
			ResultSet res2 = instruction.executeQuery("SELECT l_web, l_tweet, l_linkedin, l_fb "+"FROM universite u, lien l "+"WHERE u.id_univ = l.etr_univ"+";");
			while(res2.next()){
				univ.setUrl(res2.getString("l_web"));
				univ.setTwitter_link(res2.getString("l_tweet")); // /!\ c'est marqué tweet dans la BD 
				univ.setFacebook_link(res2.getString("l_fb"));
				univ.setLinkedin_link(res2.getString("l_linkedin"));
			}
			
			// Ne faut-il pas des liens renvoyant vers les conventions ?? Ce sont des fichiers PDFs normalement
			// du coup requête à remplir après discussion...
			ResultSet res3 = instruction.executeQuery("SELECT * " +"FROM convention "+"WHERE id_conv = "+id_dd+";");
			while(res3.next()){
				univ.setConvention_path(res3.getString("l_conv")); //lien vers la convention

			}
			int i = 0;
			ResultSet res4 = instruction.executeQuery("SELECT p.nom, p.prenom, p.mail FROM profil p, etudiant e WHERE e.etr_univ = "+id+" AND e.etr_profil = p.id_profil");
			while (res4.next()) {
				EtudiantBean eb = new EtudiantBean();
				eb.setNom(res4.getString("nom"));
				eb.setPrenom(res4.getString("prenom"));
				eb.setEmail(res4.getString("mail"));
				univ.getPersonnes().add(eb);
				i++;
			}
			univ.setNbEtudiants(i);
			
			//Il manque description mais où va-t-on la chercher ? Il manque aussi note et nbEtu, même problème
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		
		return univ;
	}
	
	public ArrayList<UniversityBean> getInfosByPays(String pays){
		ArrayList<UniversityBean> list = new ArrayList<UniversityBean>();
		
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			//note et nbEtudiant sont des ints, so ?? et l'id
			ResultSet res1 = instruction.executeQuery("SELECT * " +"FROM universite "+"WHERE pays = "+pays+";");
			while(res1.next()){
				UniversityBean univ = new UniversityBean();
				univ.setNom(res1.getString("nom"));
				univ.setPays(res1.getString("pays"));
				univ.setVille(res1.getString("ville"));
				univ.setAdresse(res1.getString("adresse"));
				univ.setLogo_path(res1.getString("logo_path"));
				univ.setType(res1.getString("type"));
				univ.setLangue(res1.getString("langue"));
				univ.setDateFondation(res1.getString("date_creation"));
				
				univ.setNote(res1.getInt("note"));
				univ.setNbEtudiants(res1.getInt("nb_etudiant"));

				//note et nbEt
				list.add(univ);
			}
			int i = 0;
			ResultSet res2 = instruction.executeQuery("SELECT l_web, l_tweet, l_linkedin, l_fb "+"FROM universite u, lien l "+"WHERE u.id_univ = l.etr_univ"+"AND u.pays LIKE "+pays+";");
			while(res2.next()){
				UniversityBean univ = new UniversityBean();
				univ.setUrl(res2.getString("l_web"));
				univ.setTwitter_link(res2.getString("l_tweet")); // /!\ c'est marqué tweet dans la BD 
				univ.setFacebook_link(res2.getString("l_fb"));
				univ.setLinkedin_link(res2.getString("l_linkedin"));
				
				list.set(i++, univ);
			}
			
			// Ne faut-il pas des liens renvoyant vers les conventions ?? Ce sont des fichiers PDFs normalement
			// du coup requête à remplir après discussion...
			
			i = 0;
			ResultSet res3 = instruction.executeQuery("SELECT * " +"FROM convention "+"WHERE pays = "+pays+";");
			while(res3.next()){
				UniversityBean univ = new UniversityBean();
				univ.setConvention_path(res3.getString("l_conv")); //lien vers la convention
				list.set(i++, univ);
				
			}
			
			//Il manque description mais où va-t-on la chercher ? Il manque aussi note et nbEtu, même problème
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		
		
		return list;
	}
	
	public void setInfo(UniversityBean univBean){
		//TODO: Reqête SQL de mise à jour des données de la base à partir du bean
	}
}
