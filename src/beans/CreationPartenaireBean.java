package beans;

public class CreationPartenaireBean {

	private String nom,pays,adresse,ville;
	private String logo_path,type,langue;
	private String date_creation,description;
	private int note,nb_etudiant;
	private String doub_dip;
	
	public CreationPartenaireBean(){
		nom="null";
		pays="null";
		adresse="null";
		ville="null";
		logo_path="null";
		type="null";
		langue="null";
		date_creation="null";
		description="null";
		doub_dip="";
		note=0;
		nb_etudiant=0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getLogo_path() {
		return logo_path;
	}

	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
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

	public String getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
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

	public int getNb_etudiant() {
		return nb_etudiant;
	}

	public void setNb_etudiant(int nb_etudiant) {
		this.nb_etudiant = nb_etudiant;
	}

	public String getDoub_dip() {
		return doub_dip;
	}

	public void setDoub_dip(String doub_dip) {
		this.doub_dip = doub_dip;
	}
	
	
}
