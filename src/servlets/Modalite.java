package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosModalite;

public class Modalite extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosModalite infoMod;
	
	public Modalite() {
		infoMod = new InfosModalite();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("mod", infoMod.getInfos(request));
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/modalites.jsp" ).forward( request, response );
	}

}
