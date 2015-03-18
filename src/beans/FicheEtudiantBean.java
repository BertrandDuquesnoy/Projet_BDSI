package beans;

public class FicheEtudiantBean {
	
	private String nom, prenom, annee, mail, login, adresse, tel;
	private int id_fiche;
	
	public FicheEtudiantBean() {
		id_fiche=0;
		nom="nom";
		prenom="prenom";
		annee="null";
		mail="null";
		login="null";
		adresse="null";
		tel="06";
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public int getId_fiche() {
		return id_fiche;
	}

	public void setId_fiche(int id_fiche) {
		this.id_fiche = id_fiche;
	}
	
	
}
