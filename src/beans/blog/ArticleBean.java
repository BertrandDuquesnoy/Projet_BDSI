package beans.blog;

import java.util.ArrayList;

public class ArticleBean {
	
	private ArrayList<String> liensIntitule, liens, commentaires;
	private String auteur, promotionAuteur, entreprise, urlEntreprise, ville, pays, langue, titre, premiereImpression, commentImpression, villeImpression, conseil, email;
	private int noteEntreprise, noteVille, nbLiens, nbCommentaires, id;
	
	public ArticleBean() {
		liens = new ArrayList<String>();
		liens.add("1er lien");
		liens.add("2eme lien");
		liensIntitule = new ArrayList<String>();
		liensIntitule.add("erasmus");
		liensIntitule.add("bourse au mérite");
		commentaires = new ArrayList<String>();
		commentaires.add("commentaire 1");
		commentaires.add("commentaire 2");
		nbCommentaires = 2;
		nbLiens = 2;
		noteEntreprise = 2;
		noteVille = 4;
		id = 5;
		auteur = "Paul Cottin";
		promotionAuteur = "2016";
		email = "null@null";
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
		return nbLiens;
	}

	public void setNbLiens(int nbLiens) {
		this.nbLiens = nbLiens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getPromotionAuteur() {
		return promotionAuteur;
	}

	public void setPromotionAuteur(String promotionAuteur) {
		this.promotionAuteur = promotionAuteur;
	}

	public int getNbCommentaires() {
		nbCommentaires = commentaires.size();
		return nbCommentaires;
	}

	public void setNbCommentaires(int nbCommentaires) {
		this.nbCommentaires = nbCommentaires;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
