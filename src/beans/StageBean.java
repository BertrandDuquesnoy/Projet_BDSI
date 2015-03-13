package beans;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class StageBean {

	private int id;
	private String nom;
	private String url;
	private String email, numTel;
	private String logo_path;
	private String pays, ville, langue, dateFondation;
	private String adresse;
	private String facebook_link, twitter_link, linkedin_link;
	private String description;
	private int note, nbEmployes;
	private ArrayList<EtudiantBean> personnes ;
	
	public StageBean(){
		id = 0;
		nom = "null";
		url = "null";
		email = "null@null";
		numTel = "06";
		logo_path = "null";
		pays = "null";
		ville = "null";
		langue = "null";
		dateFondation = "null";
		adresse = "null";
		nbEmployes = 0;
		description = "null";
		facebook_link = "null";
		twitter_link = "null";
		linkedin_link = "null";
		note = 5;
		personnes = new ArrayList<EtudiantBean>();
		personnes.add(new EtudiantBean());
		personnes.add(new EtudiantBean()); //pourquoi deux fois cette ligne ?
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

	public int getNbEmployes() {
		return nbEmployes;
	}

	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getNumTel() {
		return numTel;
	}



	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	
}
