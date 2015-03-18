package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Faq extends HttpServlet{
	
private static final long serialVersionUID = 1L;
	
	
	public Faq(){
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/faq.jsp" ).forward( request, response );
	}
}
