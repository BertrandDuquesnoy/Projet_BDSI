package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.DoubleDiplomeBean;



public class InfosDoubleDiplomes {

	DoubleDiplomeBean ddBean;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";



	public InfosDoubleDiplomes(){
		ddBean = new DoubleDiplomeBean();
	}

	int id_dd = 0;

	public DoubleDiplomeBean getInfos(int id){
		ddBean = new DoubleDiplomeBean();
		id_dd=id;
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM universite "+"WHERE id_univ = "+id+";");
			while(resultat.next()){

				ddBean.setPays(resultat.getString("pays"));
				ddBean.setVille(resultat.getString("ville"));
				ddBean.setAdresse(resultat.getString("adresse"));
				ddBean.setLogo_path(resultat.getString("logo_path"));
				ddBean.setNom(resultat.getString("nom"));
				ddBean.setType(resultat.getString("type"));
				ddBean.setLangue(resultat.getString("langue"));
				ddBean.setDate_creation(resultat.getInt("date_creation"));
				ddBean.setNote(resultat.getInt("note"));
				ddBean.setNb_etudiant(resultat.getInt("nb_etudiant"));

			}

			ResultSet resultat2 = instruction.executeQuery("SELECT * " +"FROM lien "+ "WHERE id_lien = "+id_dd+";");
			while(resultat2.next()){

				ddBean.setUrl(resultat2.getString("l_web"));
				ddBean.setFacebook_link(resultat2.getString("l_fb"));
				ddBean.setTwitter_link(resultat2.getString("l_tweet"));
				ddBean.setLinkedin_link(resultat2.getString("l_linkedin"));
			}

			ResultSet resultat3 = instruction.executeQuery("SELECT * " +"FROM contact "+ "WHERE id_contact = "+id_dd+";");
			while(resultat3.next()){

				ddBean.setTel(resultat3.getString("tel"));
				ddBean.setNomContact(resultat3.getString("nom"));
				ddBean.setPrenomContact(resultat3.getString("prenom"));
				ddBean.setFonction(resultat3.getString("fonction"));
				ddBean.setMail(resultat3.getString("mail"));
			}

		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return ddBean;
	}



}
