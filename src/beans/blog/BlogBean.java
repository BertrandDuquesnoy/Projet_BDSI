package beans.blog;

import java.util.ArrayList;

public class BlogBean {
	
	private ArrayList<String> list;
	private int nbCategories;
	
	public BlogBean() {
		list = new ArrayList<String>();
		list.add("categorie1");
		list.add("categorie2");
		list.add("categorie3");
		list.add("categorie4");
		list.add("categorie5");
		list.add("categorie6");
		list.add("categorie7");
		list.add("categorie8");
		list.add("categorie9");
		nbCategories = list.size();
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public int getNbCategories() {
		return list.size();
	}

	public void setNbCategories(int nbCategories) {
		this.nbCategories = nbCategories;
	}

}
