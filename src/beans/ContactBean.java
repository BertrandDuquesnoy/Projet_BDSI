package beans;

public class ContactBean {
	private String nom, prenom, fonction, mail, tel;
	private int id_contact ;
	private int etr_univ , etr_entreprise;

	public ContactBean() {
		setId_contact(0);
		setEtr_univ(0);
		setEtr_entreprise(0);
		nom = "nom";
		prenom = "prenom";
		fonction = "null";
		mail = "null";
		tel ="null";
	}

	public ContactBean(String nom, String prenom, String fonction, String mail, String tel){
		this.nom  = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.mail = mail;
		this.fonction = fonction;
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

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getEtr_univ() {
		return etr_univ;
	}

	public void setEtr_univ(int etr_univ) {
		this.etr_univ = etr_univ;
	}

	public int getEtr_entreprise() {
		return etr_entreprise;
	}

	public void setEtr_entreprise(int etr_entreprise) {
		this.etr_entreprise = etr_entreprise;
	}

	public int getId_contact() {
		return id_contact;
	}

	public void setId_contact(int id_contact) {
		this.id_contact = id_contact;
	}

	


}



