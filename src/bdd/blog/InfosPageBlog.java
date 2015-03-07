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
		System.out.println("suppression de l'article d'id = "+id);
	}
}
