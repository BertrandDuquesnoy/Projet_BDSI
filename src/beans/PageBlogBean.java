package beans;

import java.util.ArrayList;

public class PageBlogBean {
	
	private ArrayList<String> liensIntitule, liens, commentaires;
	private String entreprise, urlEntreprise, ville, pays, langue, titre, premiereImpression, commentImpression, villeImpression, conseil;
	private int noteEntreprise, noteVille, nbLiens;
	
	public PageBlogBean() {
		liens = new ArrayList<String>();
		liens.add("1er lien");
		liens.add("2eme lien");
		liensIntitule = new ArrayList<String>();
		liensIntitule.add("erasmus");
		liensIntitule.add("bourse au mérite");
		commentaires = new ArrayList<String>();
		nbLiens = 2;
		noteEntreprise = 4;
		noteVille = 5;
		entreprise = "null";
		urlEntreprise = "null";
		ville = "null";
		pays = "null";
		langue = "null";
		titre = "null";
		premiereImpression = "null";
		commentImpression = "null";
		villeImpression = "null";
		conseil = "null";
		}

	public ArrayList<String> getLiensIntitule() {
		return liensIntitule;
	}

	public void setLiensIntitule(ArrayList<String> liensIntitule) {
		this.liensIntitule = liensIntitule;
	}

	public ArrayList<String> getLiens() {
		return liens;
	}

	public void setLiens(ArrayList<String> liens) {
		this.liens = liens;
	}

	public ArrayList<String> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(ArrayList<String> commentaires) {
		this.commentaires = commentaires;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getUrlEntreprise() {
		return urlEntreprise;
	}

	public void setUrlEntreprise(String urlEntreprise) {
		this.urlEntreprise = urlEntreprise;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getPremiereImpression() {
		return premiereImpression;
	}

	public void setPremiereImpression(String premiereImpression) {
		this.premiereImpression = premiereImpression;
	}

	public String getCommentImpression() {
		return commentImpression;
	}

	public void setCommentImpression(String commentImpression) {
		this.commentImpression = commentImpression;
	}

	public String getVilleImpression() {
		return villeImpression;
	}

	public void setVilleImpression(String villeImpression) {
		this.villeImpression = villeImpression;
	}

	public String getConseil() {
		return conseil;
	}

	public void setConseil(String conseil) {
		this.conseil = conseil;
	}

	public int getNoteEntreprise() {
		return noteEntreprise;
	}

	public void setNoteEntreprise(int noteEntreprise) {
		this.noteEntreprise = noteEntreprise;
	}

	public int getNoteVille() {
		return noteVille;
	}

	public void setNoteVille(int noteVille) {
		this.noteVille = noteVille;
	}

	public int getNbLiens() {
		return liens.size();
	}

	public void setNbLiens(int nbLiens) {
		this.nbLiens = nbLiens;
	}

}
