package bdd.blog;

import javax.servlet.http.HttpServletRequest;

import beans.blog.PageBean;

public class InfosPageBlog {

	PageBean pb;
	
	public InfosPageBlog() {
		pb = new PageBean();
	}
	
	public PageBean getInfos(HttpServletRequest request){
		return pb;
	}
	
	public void setInfos(PageBean pb){
		
	}
	
	public void deleteArticle(int id){
		
	}
	
	public void setInfos(HttpServletRequest request){
		
	}
	
	public void addLink(String item, String link){
		//TODO: Ajouter le lien et l'item dans la liste des liens utiles de l'article
	}
}
