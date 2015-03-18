package beans;

import java.util.ArrayList;

public class ADDBean {

	private ArrayList<String> dd_nom, logo_path;
	private ArrayList<Integer> id;
	private int nbDD;
	
	public ADDBean(){
		logo_path = new ArrayList<String>();
		dd_nom = new ArrayList<String>();
		id = new ArrayList<Integer>();
	}

	public ArrayList<String> getDd_nom() {
		return dd_nom;
	}

	public void setDd_nom(ArrayList<String> dd_nom) {
		this.dd_nom = dd_nom;
	}

	public int getNbDD() {
		return dd_nom.size();
	}

	public void setNbDD(int nbDD) {
		this.nbDD = nbDD;
	}

	public ArrayList<Integer> getId() {
		return id;
	}

	public void setId(ArrayList<Integer> id) {
		this.id = id;
	}

	public ArrayList<String> getLogo_path() {
		return logo_path;
	}

	public void setLogo_path(ArrayList<String> logo_path) {
		this.logo_path = logo_path;
	}
}
