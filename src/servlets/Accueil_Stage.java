package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosAStage;

public class Accueil_Stage extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosAStage infos_as;
	
	public Accueil_Stage() {
		infos_as = new InfosAStage();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("list", infos_as.getInfos());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/accueil_stage.jsp" ).forward( request, response );
	}

}
