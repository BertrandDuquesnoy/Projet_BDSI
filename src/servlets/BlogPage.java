package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.blog.InfosArticleBlog;
import bdd.blog.InfosPageBlog;
import beans.blog.ArticleBean;

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
	 * modif=1 -> Page de modification d'un article
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
			if (request.getParameter("nouveauIntitule") != null) {
				item = request.getParameter("nouveauIntitule");
				link = request.getParameter("nouveauLien");
				id = Integer.valueOf(request.getParameter("id"));
				
				infos_articleBlog.addLink(id, item, link);
				request.setAttribute("page", infos_articleBlog.getInfos(request));
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog_modif.jsp").forward(request, response);
			}
		}catch (NullPointerException e) {
			System.out.println("null pointer - BlogPage doPost");
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog.jsp").forward(request, response);
		}
		try{
			if (request.getParameter("ville") != null) {
				infos_articleBlog.setInfos(constructArticleBean(request));
				
				request.setAttribute("page", infos_pageBlog.getInfos(request));
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog.jsp").forward(request, response);
			}
				
		} catch (NullPointerException e) {
			System.out.println("null pointer - BlogPage doPost");
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog.jsp").forward(request, response);
		}
		try {
			if (request.getParameter("com") != null) {
				infos_articleBlog.addCom(Integer.parseInt(request.getParameter("id")), request.getParameter("com"));
				
				request.setAttribute("page", infos_pageBlog.getInfos(request));
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog.jsp").forward(request, response);
			}
		} catch (NullPointerException e) {
			System.out.println("null pointer - BlogPage doPost");
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageBlog.jsp").forward(request, response);
		}
	}
	
	private ArticleBean constructArticleBean(HttpServletRequest request){
		ArticleBean a = new ArticleBean();
		a.setAuteur(request.getParameter("auteur"));
		a.setPromotionAuteur(request.getParameter("promotionAuteur"));
		a.setEntreprise(request.getParameter("entreprise"));
		a.setUrlEntreprise(request.getParameter("urlEntreprise"));
		a.setVille(request.getParameter("ville"));
		a.setPays(request.getParameter("pays"));
		a.setLangue(request.getParameter("langue"));
		a.setTitre(request.getParameter("titre"));
		a.setPremiereImpression(request.getParameter("premiereImpression"));
		a.setCommentImpression(request.getParameter("commentImpression"));
		a.setVilleImpression(request.getParameter("villeImpression"));
		a.setConseil(request.getParameter("conseil"));
		a.setNoteEntreprise(Integer.parseInt(request.getParameter("noteEntreprise")));
		a.setNoteVille(Integer.parseInt(request.getParameter("noteVille")));
		a.setNbLiens(Integer.parseInt(request.getParameter("nbLiens")));
		a.setId(Integer.parseInt(request.getParameter("id")));
		
		ArrayList<String> liens = new ArrayList<String>();
		ArrayList<String> items = new ArrayList<String>();
		for (int i = 0; i < Integer.parseInt(request.getParameter("nbLiens")); i++) {
			liens.add(request.getParameter("lien"+i+""));
			items.add(request.getParameter("item"+i+""));
		}
		
		a.setLiensIntitule(items);
		a.setLiens(liens);
		
		return a;
	}

}
