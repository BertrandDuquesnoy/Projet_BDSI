package bdd.blog;

import javax.servlet.http.HttpServletRequest;

import beans.PageBlogBean;

public class InfosPageBlog {

	PageBlogBean pbb;
	int id;
	
	public InfosPageBlog() {
		pbb = new PageBlogBean();
		id = 0; //Par exemple, cette info sera récupérée dans la request
	}
	
	public PageBlogBean getInfos(HttpServletRequest request){
		//TODO: Récupérer toutes les infos de tous les articles concernant une catégorie
		return pbb;
	}
}
