package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.ModaliteBean;

public class InfosModalite {

	ModaliteBean modBean;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";

	public InfosModalite() {
		modBean = new ModaliteBean();
	}

	public ModaliteBean getInfos(HttpServletRequest request){
		modBean = new ModaliteBean();
		//TODO: Requête SQL de récupération des données de modalité

		//int id_dd=0;
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			//on recupere le lien concerant les aides financieres pour partir etudier a l'etranger
			ResultSet resultat = instruction.executeQuery("SELECT lien " +"FROM lien_utile "+"WHERE id = 4"+";");
			while(resultat.next()){
				modBean.setAides(resultat.getString("lien"));
			}

			
			// cette requete renvoie vers la page International/partir a l'etranger de TN
			// on y trouve les conditions 
			ResultSet res = instruction.executeQuery("SELECT lien "+"FROM lien_utile "+"WHERE id = 3"+";"); 
			while(res.next()){
				modBean.setConditions(res.getString("lien"));
			}
			

			//lien de l'université pour les conditions ? C'est télécom qui les pose donc on devrait mettre la page dans les liens utiles
			// cette requete renvoie vers le site web de l'universite 
			// c'est a l'eleve d'aller chercher les infos qui l'interesse sur ce site
//			ResultSet res1 = instruction.executeQuery("SELECT l_web "+"FROM universite u, lien l "+"WHERE u.id_univ = l.etr_univ"+";");
//			while(res1.next()){
//				modBean.setConditions(res1.getString("l_web"));
//			}
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return modBean;
	}

}