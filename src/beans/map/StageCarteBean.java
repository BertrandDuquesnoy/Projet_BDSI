package beans.map;

public class StageCarteBean {
	
	private String titre, description, itemLien, lien, adresse;
	
	public StageCarteBean() {
		titre = "Mines de charbon";
		description = "Longue vie au charbon, aidez nous à en extraire encore un peu !";
		itemLien = "Pour en savoir plus";
		lien = "http://fr.wikipedia.org/wiki/Poitou";
		adresse = "Dunkerque";
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
