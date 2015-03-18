package bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import beans.FicheEtudiantBean;


public class InfosFicheEtudiant {
	FicheEtudiantBean fiche;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";

	public InfosFicheEtudiant(){
		fiche = new FicheEtudiantBean();
	}

	int id_ficheEtu = 0; 
	
	public FicheEtudiantBean getInfos(HttpServletRequest request){
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet resultat = instruction.executeQuery("SELECT p.login, p.nom, p.prenom, p.annee, p.mail, p.tel, p.adresse " +" FROM profil p, etudiant e, fiche_etudiant f "+ " WHERE p.id_profil=e.etr_profil AND e.id_etud=f.id_fiche AND p.annee=e.annee ;");
			
			while(resultat.next()){
				fiche.setPrenom(resultat.getString("prenom"));
				fiche.setNom(resultat.getString("nom"));
				fiche.setLogin(resultat.getString("fonction"));
				fiche.setMail(resultat.getString("mail"));
				fiche.setAdresse_sejour(resultat.getString("adresse_sejour"));
				fiche.setTel(resultat.getString("tel"));				
			}			
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}
		return fiche;
	}
	
	
}
