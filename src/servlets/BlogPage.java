package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.blog.InfosArticleBlog;
import bdd.blog.InfosPageBlog;

public class BlogPage extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosPageBlog infos_pageBlog;
	InfosArticleBlog infos_articleBlog;
	
	public BlogPage() {
		infos_pageBlog = new InfosPageBlog();
		infos_articleBlog = new InfosArticleBlog();
	}
	
	/**
	 * Explication paramètres : 
	 * modif=1 -> Modification d'un article
	 * modif=2 -> Suppression d'un article
	 * modif=3 -> Suppression d'un "lien utile"
	 * ajout=1 -> Ajout d'un "lien utile" pour un article
	 * ajout=2 -> Confirmation de suppression d'un article
	 * ajout=3 -> Confirmation de suppression d'un "lien utile"
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		try {
			if (request.getParameter("modif").equals("1")) {
				request.setAttribute("page", infos_articleBlog.getInfos(request));
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog_modif.jsp").forward(request, response);
			}
			else if (request.getParameter("modif").equals("2")) {
				infos_pageBlog.deleteArticle(Integer.parseInt(request.getParameter("id")));
				this.getServletContext().getRequestDispatcher( "/WEB-INF/pageBlog.jsp" ).forward( request, response );
			}
			else if (request.getParameter("modif").equals("3")) {
				infos_articleBlog.deleteLink(Integer.parseInt(request.getParameter("id")), Integer.parseInt(request.getParameter("id_lien")));
				this.getServletContext().getRequestDispatcher( "/WEB-INF/pageBlog.jsp" ).forward( request, response );
			}
			else if(request.getParameter("ajout").equals("1")){
				request.setAttribute("id", request.getParameter("id"));
				this.getServletContext().getRequestDispatcher("/WEB-INF/utils/ajoutLien.jsp").forward(request, response);
			}
			else if (request.getParameter("ajout").equals("2")) {
				request.setAttribute("id", request.getParameter("id"));
				request.setAttribute("text", "cet article");
				request.setAttribute("modif", 2);
				this.getServletContext().getRequestDispatcher("/WEB-INF/utils/supprConfirm.jsp").forward(request, response);
			}
			else if (request.getParameter("ajout").equals("3")) {
				request.setAttribute("id", request.getParameter("id"));
				request.setAttribute("id_lien", request.getParameter("id_lien"));
				request.setAttribute("text", "ce lien");
				request.setAttribute("modif", 3);
				this.getServletContext().getRequestDispatcher("/WEB-INF/utils/supprConfirm.jsp").forward(request, response);
			}
			else{
				request.setAttribute("page", infos_pageBlog.getInfos(request));
				this.getServletContext().getRequestDispatcher( "/WEB-INF/pageBlog.jsp" ).forward( request, response );
			}
		} catch (NullPointerException e) {
			System.out.println("null pointer");
			request.setAttribute("page", infos_pageBlog.getInfos(request));
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog.jsp").forward(request, response);
		}
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String item = "";
		String link = "";
		int id = 0;
		
		try {
			item = request.getParameter("nouveauIntitule");
			link = request.getParameter("nouveauLien");
			id = Integer.valueOf(request.getParameter("id"));
			
			infos_articleBlog.addLink(id, item, link);
		} catch (NullPointerException e) {
			
		}finally{
			request.setAttribute("page", infos_articleBlog.getInfos(request));
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog_modif.jsp").forward(request, response);
		}		
	}

}
