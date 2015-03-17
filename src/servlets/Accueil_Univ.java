package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosAUniv;

public class Accueil_Univ extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosAUniv infos_av;
	
	public Accueil_Univ() {
		infos_av = new InfosAUniv();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("list", infos_av.getInfos());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/accueil_univ.jsp" ).forward( request, response );
	}

}
