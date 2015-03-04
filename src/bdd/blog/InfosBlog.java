package bdd.blog;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import beans.BlogBean;

public class InfosBlog {
	
	BlogBean bb;
	
	public InfosBlog() {
		bb = new BlogBean();
	}
	
	public BlogBean getInfos(HttpServletRequest request){
		//TODO: Requêtes qui renvoient les différentes catégories et leurs id
		return bb;
	}

}
