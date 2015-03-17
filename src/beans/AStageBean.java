package beans;

import java.util.ArrayList;

public class AStageBean {

	private ArrayList<String> noms, duree, annee, pays;
	private ArrayList<Integer> id;
	private int nbStages;
	
	public AStageBean(){
		noms = new ArrayList<String>();
		noms.add("null");
		duree = new ArrayList<String>();
		duree.add("null");
		annee = new ArrayList<String>();
		annee.add("null");
		pays = new ArrayList<String>();
		pays.add("null");
		id = new ArrayList<Integer>();
		id.add(1);
	}

	public ArrayList<String> getNoms() {
		return noms;
	}

	public void setNoms(ArrayList<String> noms) {
		this.noms = noms;
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
		return noms.size();
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
}
