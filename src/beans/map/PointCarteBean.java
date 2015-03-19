package beans.map;

public class PointCarteBean {
	/**
	 * l'attribut type est égal à : univ, stage ou dd
	 */
	
	private String titre, description, item, lien, adresse, type;
	private int id;

	public PointCarteBean() {
		titre = "Université de Lorraine";
		description = "c'est trop long à écrire";
		item = "Pour plus d'infos : ";
		lien = "cherche le lien";
		adresse = "Nancy";
		type = "univ";
		id = 3;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
