package beans;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class UniversityBean {

	private int id;
	private String nom;
	private String l_web;
	private String logo_path;
	private String l_formation;
	private String pays, ville, type, langue, dateFondation, convention_path, adresse;
	private String linkedin_path, l_fb, l_tweet, l_linkedin;
	private String description;
	private float note;
	private int nbEtudiants;
	private ArrayList<EtudiantBean> personnes ;
	
	public UniversityBean(){
		id = 0;
		nom = "null";
		l_web = "null";
		logo_path = "null";
		pays = "null";
		ville = "null";
		adresse="null";
		type = "null";
		langue = "null";
		dateFondation = "null";
		nbEtudiants = 0;
		description = "null";
		l_fb = "null";
		l_tweet = "null";
		l_linkedin = "null";
		note = 5;
		personnes = new ArrayList<EtudiantBean>();
		personnes.add(new EtudiantBean());
		//personnes.add(new EtudiantBean());
	}
	
	

	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrl() {
		return l_web;
	}

	public void setUrl(String l_web) {
		this.l_web = l_web;
	}

	public String getLogo_path() {
		return logo_path;
	}

	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
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

	public String getDateFondation() {
		return dateFondation;
	}

	public void setDateFondation(String dateFondation) {
		this.dateFondation = dateFondation;
	}

	public String getConvention_path() {
		return convention_path;
	}

	public void setConvention_path(String convention_path) {
		this.convention_path = convention_path;
	}

	public int getNbEtudiants() {
		return nbEtudiants;
	}

	public void setNbEtudiants(int nbEtudiants) {
		this.nbEtudiants = nbEtudiants;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float f) {
		this.note = f;
	}
	
	public String getLinkedin_path() {
		return linkedin_path;
	}

	public void setLinkedin_path(String linkedin_path) {
		this.linkedin_path = linkedin_path;
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

	public ArrayList<EtudiantBean> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(ArrayList<EtudiantBean> personnes) {
		this.personnes = personnes;
	}
	
	public String getL_formation() {
		return l_formation;
	}

	public void setL_formation(String l_formation) {
		this.l_formation = l_formation;
	}
	
}
