package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosADD;

public class Accueil_DD extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosADD infos_add;
	
	public Accueil_DD() {
		infos_add = new InfosADD();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("list", infos_add.getInfos());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/accueil_dd.jsp" ).forward( request, response );
	}

}
