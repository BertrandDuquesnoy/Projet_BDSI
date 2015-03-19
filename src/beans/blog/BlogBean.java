package beans.blog;

import java.util.ArrayList;

public class BlogBean {
	
	private ArrayList<String> img_path, flag_path, pays;
	private int nbCategories;
	
	public BlogBean() {
		img_path = new ArrayList<String>();
		flag_path = new ArrayList<String>();
		pays = new ArrayList<String>();
		
		
	}


	public int getNbCategories() {
		return pays.size();
	}

	public void setNbCategories(int nbCategories) {
		this.nbCategories = nbCategories;
	}


	public ArrayList<String> getImg_path() {
		return img_path;
	}


	public void setImg_path(ArrayList<String> img_path) {
		this.img_path = img_path;
	}


	public ArrayList<String> getFlag_path() {
		return flag_path;
	}


	public void setFlag_path(ArrayList<String> flag_path) {
		this.flag_path = flag_path;
	}


	public ArrayList<String> getPays() {
		return pays;
	}


	public void setPays(ArrayList<String> pays) {
		this.pays = pays;
	}

}
