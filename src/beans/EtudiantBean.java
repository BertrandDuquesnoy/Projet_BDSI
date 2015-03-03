package beans;

public class EtudiantBean {

	private String prenom, nom, promo, email, departement, majeur, mineur;
	
	public EtudiantBean(){
		prenom = "null";
		nom = "null";
		promo = "null";
		email = "null@null";
		departement = "null";
		majeur = "null";
		mineur = "null";
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajeur() {
		return majeur;
	}

	public void setMajeur(String majeur) {
		this.majeur = majeur;
	}

	public String getMineur() {
		return mineur;
	}

	public void setMineur(String mineur) {
		this.mineur = mineur;
	}
}
