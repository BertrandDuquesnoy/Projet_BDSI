package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosPresentation;

public class Presentation extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosPresentation infosPres;
	
	public Presentation() {
		infosPres = new InfosPresentation();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			if (request.getParameter("modif").equals("1")) {
				this.getServletContext().getRequestDispatcher( "/WEB-INF/presentation_modif.jsp" ).forward( request, response );
			}else {
				this.getServletContext().getRequestDispatcher( "/WEB-INF/presentation.jsp" ).forward( request, response );
			}
		} catch (NullPointerException e) {
			System.out.println("null pointer - Presentation");
			this.getServletContext().getRequestDispatcher( "/WEB-INF/presentation.jsp" ).forward( request, response );
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			if (request.getParameter("modif").equals("2")) {
				this.getServletContext().getRequestDispatcher( "/WEB-INF/presentation.jsp" ).forward( request, response );
			}
		} catch (NullPointerException e) {
			System.out.println("null pointer - post - presentation");
		}
	}
}
