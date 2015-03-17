package beans;

import java.util.ArrayList;

public class AUnivBean {

	private ArrayList<String> pays, paths;
	private ArrayList<Integer> id;
	private int nbUniv;
	
	public AUnivBean(){
		pays = new ArrayList<String>();
		pays.add("null");
		paths = new ArrayList<String>();
		paths.add("images/pays/canada.png");
		id = new ArrayList<Integer>();
		id.add(1);
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

	public ArrayList<String> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<String> paths) {
		this.paths = paths;
	}
}
