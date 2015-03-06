package bdd.blog;

import javax.servlet.http.HttpServletRequest;

import beans.blog.ArticleBean;

public class InfosArticleBlog {

	ArticleBean ab;
	int id;
	
	public InfosArticleBlog() {
		ab = new ArticleBean();
		id = 0; //Par exemple, cette info sera récupérée dans la request
	}
	
	public ArticleBean getInfos(HttpServletRequest request){
		//TODO: Récupérer toutes les infos de tous les articles concernant une catégorie
		return ab;
	}
	
	public void setInfos(HttpServletRequest request){
		
	}
	
	public void addLink(String item, String link){
		//TODO: Ajouter le lien et l'item dans la liste des liens utiles de l'article
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
