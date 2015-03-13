package beans;

import java.util.ArrayList;

public class DoubleDiplomeBean {

	private String nom, pays, ville, l_web, adresse, tel, logo_path, l_fb, l_tweet, l_linkedin, type, langue, nomContact, mail, prenomContact, fonction;
	private int note, nb_etudiant, date_creation;
	private ArrayList<EtudiantBean> etudiants;
	
	public DoubleDiplomeBean() {
		nom = "null";
		pays = "null";
		ville = "null";
		l_web = "null";
		adresse = "null";
		tel = "null";
		logo_path = "null";
		l_fb = "null";
		l_tweet = "null";
		l_linkedin = "null";
		type = "null";
		langue = "null";
		nomContact="null";
		prenomContact="null";
		mail="null";
		fonction="null";

		date_creation = 0;
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
		return l_web;
	}
	public void setUrl(String l_web) {
		this.l_web = l_web;
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
		return l_fb;
	}
	public void setFacebook_link(String l_fb) {
		this.l_fb = l_fb;
	}
	public String getTwitter_link() {
		return l_tweet;
	}
	public void setTwitter_link(String l_tweet) {
		this.l_tweet = l_tweet;
	}
	public String getLinkedin_link() {
		return l_linkedin;
	}
	public void setLinkedin_link(String l_linkedin) {
		this.l_linkedin = l_linkedin;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}

	public ArrayList<EtudiantBean> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(ArrayList<EtudiantBean> etudiants) {
		this.etudiants = etudiants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNb_etudiant() {
		return nb_etudiant;
	}

	public void setNb_etudiant(int nb_etudiant) {
		this.nb_etudiant = nb_etudiant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public int getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(int date_creation) {
		this.date_creation = date_creation;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getPrenomContact() {
		return prenomContact;
	}

	public void setPrenomContact(String prenomContact) {
		this.prenomContact = prenomContact;
	}

	public String getNomContact() {
		return nomContact;
	}

	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	} 
}
