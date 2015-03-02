package servlets;

import java.io.IOException;

import javax.lang.model.element.NestingKind;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosPersonne;
import bdd.InfosUniversity;
import beans.UniversityBean;

public class University extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		InfosUniversity infos_univ = new InfosUniversity();
		InfosPersonne infos_pers = new InfosPersonne();
		
		request.setAttribute("personne", infos_pers.infoPersonne(request));
		request.setAttribute("university", infos_univ.infosUniversity(request));
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/university.jsp" ).forward( request, response );
	}
}
