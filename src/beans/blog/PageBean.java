package beans.blog;

import java.util.ArrayList;

public class PageBean {
	
	private ArrayList<ArticleBean> articles;
	private int nbArticles;
	
	public PageBean() {
		articles = new ArrayList<ArticleBean>();
		articles.add(new ArticleBean());
		articles.add(new ArticleBean());
	}

	public ArrayList<ArticleBean> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<ArticleBean> articles) {
		this.articles = articles;
	}

	public int getNbArticles() {
		return articles.size();
	}

	public void setNbArticles(int nbArticles) {
		this.nbArticles = nbArticles;
	}

}
