package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Contact extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	public Contact(){
	
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try{
			if (request.getParameter("modif").equals("1")) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/contact_modif.jsp").forward(request, response);
			}
			else{
				this.getServletContext().getRequestDispatcher( "/WEB-INF/contact.jsp" ).forward( request, response );
			}
		}catch(NullPointerException e){
			System.out.println("null pointer - contact");
			this.getServletContext().getRequestDispatcher( "/WEB-INF/contact.jsp" ).forward( request, response );
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher( "/WEB-INF/contact.jsp" ).forward( request, response );
	}

}
