package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.LdapConnectMdp;
import modele.LdapException;


public class Connexion extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Connexion(){
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/connexion.jsp" ).forward( request, response );
	}
	}
