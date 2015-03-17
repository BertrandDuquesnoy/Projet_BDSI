package beans;

import java.util.ArrayList;

public class AStageBean {

	private ArrayList<String> fonctions, duree, annee, pays, entreprise;
	private ArrayList<Integer> id;
	private int nbStages;
	
	public AStageBean(){
		fonctions = new ArrayList<String>();
		fonctions.add("null");
		duree = new ArrayList<String>();
		duree.add("null");
		annee = new ArrayList<String>();
		annee.add("null");
		pays = new ArrayList<String>();
		pays.add("null");
		id = new ArrayList<Integer>();
		id.add(1);
		entreprise = new ArrayList<String>();
		entreprise.add("null");
	}

	public ArrayList<String> getNoms() {
		return fonctions;
	}

	public void setNoms(ArrayList<String> fonctions) {
		this.fonctions = fonctions;
	}

	public ArrayList<String> getDuree() {
		return duree;
	}

	public void setDuree(ArrayList<String> duree) {
		this.duree = duree;
	}

	public ArrayList<String> getAnnee() {
		return annee;
	}

	public void setAnnee(ArrayList<String> annee) {
		this.annee = annee;
	}

	public ArrayList<String> getPays() {
		return pays;
	}

	public void setPays(ArrayList<String> pays) {
		this.pays = pays;
	}

	public int getNbStages() {
		return fonctions.size();
	}

	public void setNbStages(int nbStages) {
		this.nbStages = nbStages;
	}

	public ArrayList<Integer> getId() {
		return id;
	}

	public void setId(ArrayList<Integer> id) {
		this.id = id;
	}

	public ArrayList<String> getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(ArrayList<String> entreprise) {
		this.entreprise = entreprise;
	}
}
