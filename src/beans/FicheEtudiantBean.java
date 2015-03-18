package beans;

public class FicheEtudiantBean {
	
	private String nom, prenom, annee, mail, login, adresse_sejour, tel, date_sej_deb, date_sej_fin;
	private int id_fiche, credit_ects, etr_ecrit_par;
	
	public FicheEtudiantBean() {
		id_fiche=0;
		credit_ects=0;
		etr_ecrit_par=0;
		nom="nom";
		prenom="prenom";
		annee="null";
		mail="null";
		login="null";
		adresse_sejour="null";
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

	public String getAdresse_sejour() {
		return adresse_sejour;
	}

	public void setAdresse_sejour(String adresse_sejour) {
		this.adresse_sejour = adresse_sejour;
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

	public int getCredit_ects() {
		return credit_ects;
	}

	public void setCredit_ects(int credit_ects) {
		this.credit_ects = credit_ects;
	}

	public int getEtr_ecrit_par() {
		return etr_ecrit_par;
	}

	public void setEtr_ecrit_par(int etr_ecrit_par) {
		this.etr_ecrit_par = etr_ecrit_par;
	}

	public String getDate_sej_deb() {
		return date_sej_deb;
	}

	public void setDate_sej_deb(String date_sej_deb) {
		this.date_sej_deb = date_sej_deb;
	}

	public String getDate_sej_fin() {
		return date_sej_fin;
	}

	public void setDate_sej_fin(String date_sej_fin) {
		this.date_sej_fin = date_sej_fin;
	}
	
	
}
