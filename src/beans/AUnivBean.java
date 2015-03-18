package beans;

import java.util.ArrayList;

public class AUnivBean {

	private ArrayList<String> pays, logo_path;
	private ArrayList<Integer> id;
	private int nbUniv;
	
	public AUnivBean(){
		pays = new ArrayList<String>();
		logo_path = new ArrayList<String>();
		id = new ArrayList<Integer>();
	}

	public ArrayList<String> getPays() {
		return pays;
	}

	public void setPays(ArrayList<String> pays) {
		this.pays = pays;
	}

	public int getNbUniv() {
		return pays.size();
	}

	public void setNbUniv(int nbUniv) {
		this.nbUniv = nbUniv;
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
