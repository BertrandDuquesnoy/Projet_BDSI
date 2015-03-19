package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.blog.InfosBlog;
import beans.blog.BlogBean;
import beans.GeneralBeans;

public class Blog extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosBlog infos_blog;
	GeneralBeans global;
	
	public Blog() {
		infos_blog = new InfosBlog();
		global = new GeneralBeans();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("bb", infos_blog.getInfos(request));
		
		global.setTitre("Relations Internationales");
		
		request.setAttribute("global", global);
		
		try{
			if (request.getParameter("modif").equals("1")) {
				this.getServletContext().getRequestDispatcher( "/WEB-INF/blog_modif.jsp" ).forward( request, response );
			}else if(request.getParameter("modif").equals("2")){
				String nom = null;
				nom = request.getParameter("name");
				if (nom != null) {
					System.out.println("Suppression de la catégorie : "+nom);
					this.getServletContext().getRequestDispatcher( "/WEB-INF/blog.jsp" ).forward( request, response );
				}
			}
			else if (request.getParameter("pays") != null) {
				request.setAttribute("bb", infos_blog.getInfosByPays(request.getParameter("pays")));
			}
			else
				this.getServletContext().getRequestDispatcher( "/WEB-INF/blog.jsp" ).forward( request, response );
		}catch(NullPointerException e){
			System.out.println("nullPointerException");
			this.getServletContext().getRequestDispatcher( "/WEB-INF/blog.jsp" ).forward( request, response );
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		BlogBean bb = infos_blog.getInfos(request);
//	
//		ArrayList<String> list = new ArrayList<String>();
//		String tmp ="";
//		int i = 0;
//		while((tmp = (String) request.getParameter(String.valueOf(i))) != null){
//			list.add(tmp);
//			i++;
//		}
//		
//		bb.setList(list);
//		bb.setNbCategories(list.size());
//		
//		infos_blog.setInfos(bb);
//		request.setAttribute("bb", infos_blog.getInfos(request));
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/blog.jsp" ).forward( request, response );
	}

}
