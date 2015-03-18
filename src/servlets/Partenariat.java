<<<<<<< HEAD
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Partenariat extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Partenariat(){
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/partenariat.jsp" ).forward( request, response );
	}
	
}
=======
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Partenariat extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Partenariat(){
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/partenariat.jsp" ).forward( request, response );
	}
	
}
>>>>>>> b2dc76f3c194ebe353b0cf6a7c10780cb044015f
