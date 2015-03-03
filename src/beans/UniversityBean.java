package beans;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class UniversityBean {

	private int id;
	private String nom;
	private String url;
	private String logo_path;
	private String pays, ville, type, langue, dateFondation, convention_path;
	private String linkedin_path, facebook_link, twitter_link, linkedin_link;
	private String description;
	private int note, nbEtudiants;
	private ArrayList<EtudiantBean> personnes ;
	
	public UniversityBean(){
		id = 0;
		nom = "null";
		url = "null";
		logo_path = "null";
		pays = "null";
		ville = "null";
		type = "null";
		langue = "null";
		dateFondation = "null";
		nbEtudiants = 0;
		description = "null";
		facebook_link = "null";
		twitter_link = "null";
		linkedin_link = "null";
		note = 5;
		personnes = new ArrayList<EtudiantBean>();
		personnes.add(new EtudiantBean());
		personnes.add(new EtudiantBean());
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
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	
	public String getLinkedin_path() {
		return linkedin_path;
	}

	public void setLinkedin_path(String linkedin_path) {
		this.linkedin_path = linkedin_path;
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



	public ArrayList<EtudiantBean> getPersonnes() {
		return personnes;
	}



	public void setPersonnes(ArrayList<EtudiantBean> personnes) {
		this.personnes = personnes;
	}
	
	
}
