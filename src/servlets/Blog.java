package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.blog.InfosBlog;
import beans.BlogBean;

public class Blog extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosBlog infos_blog;
	
	public Blog() {
		infos_blog = new InfosBlog();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("bb", infos_blog.getInfos(request));
		
		try{
			if (request.getParameter("modif").equals("1")) {
				this.getServletContext().getRequestDispatcher( "/WEB-INF/blog_modif.jsp" ).forward( request, response );
			}else
				this.getServletContext().getRequestDispatcher( "/WEB-INF/blog.jsp" ).forward( request, response );
		}catch(NullPointerException e){
			this.getServletContext().getRequestDispatcher( "/WEB-INF/blog.jsp" ).forward( request, response );
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		BlogBean bb = new BlogBean();
		
		//TODO: setters
		
		infos_blog.setInfos(bb);
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/blog.jsp" ).forward( request, response );
	}

}
