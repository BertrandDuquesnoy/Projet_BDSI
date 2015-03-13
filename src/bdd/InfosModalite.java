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
		//TODO: Requête SQL de récupération des données de modalité

		int id_dd=0;
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			//on récupère où le lien pour les aides ? il faut changer la requête et mettre le nom de la colonne dans le getString
			ResultSet resultat = instruction.executeQuery("SELECT * " +"FROM universite "+"WHERE id_univ = "+id_dd+";");
			while(resultat.next()){
				modBean.setAides(resultat.getString(""));
			}

			//lien de l'université pour les conditions ? C'est télécom qui les pose donc on devrait mettre la page dans les liens utiles
			
			/*ResultSet res = instruction.executeQuery("SELECT l_web "+"FROM universite u, lien l "+"WHERE u.id_univ = l.etr_univ"+";");
			while(res.next()){
				modBean.setConditions(res.getString("l_web"));
			}*/
			
			ResultSet res = instruction.executeQuery("SELECT lien "+"FROM lien_utile "+"WHERE id = 3"+";"); //lien 3 renvoit vers les conditions
			while(res.next()){
				modBean.setConditions(res.getString("lien"));
			}
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return modBean;
	}

}