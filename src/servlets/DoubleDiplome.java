package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosDoubleDiplomes;

public class DoubleDiplome extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosDoubleDiplomes infos_dd;
	
	public DoubleDiplome(){
		infos_dd = new InfosDoubleDiplomes();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("dd", infos_dd.getInfos(Integer.valueOf(request.getParameter("id_univ"))));
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/doubleDiplome.jsp" ).forward( request, response );
	}
	
	

}
