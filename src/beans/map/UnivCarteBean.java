package beans.map;

public class UnivCarteBean {

private String titre, description, itemLien, lien, adresse;
	
	public UnivCarteBean() {
		titre = "Université du Poitou";
		description = "L'université du Poitou est super hypra cool, venez vite étudiez là-bas !!!!!!!";
		itemLien = "Pour en savoir plus";
		lien = "http://fr.wikipedia.org/wiki/Poitou";
		adresse = "Poitiers";
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

	public String getItemLien() {
		return itemLien;
	}

	public void setItemLien(String itemLien) {
		this.itemLien = itemLien;
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
}
