package beans;

public class PersonBean {

	private String nom, prenom, annee, coloration;
	
	public PersonBean() {
		nom = "nom";
		prenom = "prenom";
		annee = "null";
		coloration = "null";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getColoration() {
		return coloration;
	}

	public void setColoration(String coloration) {
		this.coloration = coloration;
	}
}
