package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosCarte;

public class Accueil extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosCarte infos_carte;
	
	public Accueil() {
		infos_carte = new InfosCarte();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			if (request.getParameter("carte").equals("1")) {
				request.setAttribute("carte", infos_carte.getInfos());
				this.getServletContext().getRequestDispatcher( "/WEB-INF/googleMap.jsp" ).forward( request, response );
			}else{
				this.getServletContext().getRequestDispatcher( "/WEB-INF/AccueilEtuConnecte.jsp" ).forward( request, response );
			}
		} catch (NullPointerException e) {
			this.getServletContext().getRequestDispatcher( "/WEB-INF/AccueilEtuConnecte.jsp" ).forward( request, response );
		}
	}

}
