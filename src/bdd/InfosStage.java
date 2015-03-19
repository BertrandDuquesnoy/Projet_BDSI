package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import beans.EtudiantBean;
import beans.StageBean;

public class InfosStage {
	
	StageBean sb;
	String pilote = "com.mysql.jdbc.Driver";
	String nomBase = "bdsi_sie1";
	
	public InfosStage() {
		sb = new StageBean();
	}
	
	int id_dd=0;
	
	public StageBean getInfos(){
		sb = new StageBean();
		
		/*private int id;
		private String nom;
		private String url;
		private String email, numTel;
		private String logo_path;
		private String pays, ville, langue, dateFondation;
		private String adresse;
		private String facebook_link, twitter_link, linkedin_link;
		private String description;
		private int note, nbEmployes;
		private ArrayList<EtudiantBean> personnes ;*/
		
		
		try{
			Class.forName(pilote);

			Connection connexion = DriverManager.getConnection("jdbc:mysql://bdsi.telecomnancy.eu:3306/"+nomBase,"sie1","sie1");

			Statement instruction = connexion.createStatement();

			ResultSet res1 = instruction.executeQuery("SELECT * " +"FROM entreprise en, etudiant et , lien l "+"WHERE en.id_entreprise = et.etr_entrprise = l.etr_entreprise "+";");
			while(res1.next()){
				sb.setNom(res1.getString("nom"));
				sb.setUrl(res1.getString("l_web"));
				sb.setEmail(res1.getString("mail"));
				sb.setLogo_path(res1.getString("logo_path"));
				sb.setPays(res1.getString("pays"));
				sb.setVille(res1.getString("ville"));
				sb.setLangue(res1.getString("langue"));
				sb.setDateFondation(res1.getString("date_creation"));
				sb.setAdresse(res1.getString("adresse"));
				sb.setFacebook_link(res1.getString("l_fb"));
				sb.setTwitter_link(res1.getString("l_tweet"));
				sb.setLinkedin_link(res1.getString("l_linkedin"));
				//pas de num tél de l'élève, si entreprise, le rentrer en dur ?
				//note et nbEmpl
			}
		}
		catch (Exception e){

			System.out.println("echec pilote : "+e);
		}	
		return sb;
	}
	
	public void setInfos(StageBean sb){
		//TODO: requêtes SQL pour updater la bdd avec les données de sb
	}

}
