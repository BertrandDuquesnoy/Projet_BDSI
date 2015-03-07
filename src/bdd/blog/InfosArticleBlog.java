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
	
	public void addLink(int id, String item, String link){
		System.out.println("ajout de "+item+", à : "+link+"; id="+id);
		//TODO: Ajouter le lien et l'item dans la liste des liens utiles de l'article
	}
	
	public void deleteLink(int id, int id_lien){
		System.out.println("suppression du lien "+id_lien+", de l'article d'id : "+id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
