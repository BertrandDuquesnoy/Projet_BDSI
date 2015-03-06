package beans;

import java.util.ArrayList;

public class DoubleDiplomeBean {

	private String pays, ville, url, adresse, tel, logo_path, facebook_link, twitter_link, linkedin_link;
	private int note, nb_etudiant;
	private ArrayList<EtudiantBean> etudiants;
	
	public DoubleDiplomeBean() {
		pays = "null";
		ville = "null";
		url = "null";
		adresse = "null";
		tel = "null";
		logo_path = "null";
		facebook_link = "null";
		twitter_link = "null";
		linkedin_link = "null";
		note = 0;
		nb_etudiant = 0;
		etudiants = new ArrayList<EtudiantBean>();
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getLogo_path() {
		return logo_path;
	}
	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}
	public String getFacebook_link() {
		return facebook_link;
	}
	public void setFacebook_link(String facebook_link) {
		this.facebook_link = facebook_link;
	}
	public String getTwitter_link() {
		return twitter_link;
	}
	public void setTwitter_link(String twitter_link) {
		this.twitter_link = twitter_link;
	}
	public String getLinkedin_link() {
		return linkedin_link;
	}
	public void setLinkedin_link(String linkedin_link) {
		this.linkedin_link = linkedin_link;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public int getNbEtudiant() {
		return nb_etudiant;
	}
	public void setNbEtudiant(int nb_etudiant) {
		this.nb_etudiant = nb_etudiant;
	}
	public ArrayList<EtudiantBean> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(ArrayList<EtudiantBean> etudiants) {
		this.etudiants = etudiants;
	} 
}
