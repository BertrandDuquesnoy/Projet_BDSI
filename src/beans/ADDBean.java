package beans;

import java.util.ArrayList;

public class ADDBean {

	private ArrayList<String> dd, paths;
	private ArrayList<Integer> id;
	private int nbDD;
	
	public ADDBean(){
		paths = new ArrayList<String>();
		paths.add("images/pays/canada.png");
		dd = new ArrayList<String>();
		dd.add("null");
		id = new ArrayList<Integer>();
		id.add(1);
	}

	public ArrayList<String> getDd() {
		return dd;
	}

	public void setDd(ArrayList<String> dd) {
		this.dd = dd;
	}

	public int getNbDD() {
		return dd.size();
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

	public ArrayList<String> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<String> paths) {
		this.paths = paths;
	}
}
