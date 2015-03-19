package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosPersonne;
import bdd.InfosUniversity;


public class Contact extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InfosPersonne infos_pers;
	InfosUniversity infos_univ;

	public Contact(){
		infos_pers = new InfosPersonne();
		infos_univ = new InfosUniversity();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try{
			if (request.getParameter("modif").equals("1")) {
				request.setAttribute("personne", infos_pers.infoPersonneById(Integer.valueOf(request.getParameter("id"))));
				request.setAttribute("university", infos_univ.getinfos(Integer.valueOf(request.getParameter("id"))));
				this.getServletContext().getRequestDispatcher("/WEB-INF/contact_modif.jsp").forward(request, response);
			}else if (request.getParameter("id") != null) {
				System.out.println("id : "+request.getParameter("id"));
				request.setAttribute("contact", infos_univ.getinfos(Integer.valueOf(request.getParameter("id"))));
				this.getServletContext().getRequestDispatcher( "/WEB-INF/contact.jsp" ).forward( request, response );
			}
			else{
				this.getServletContext().getRequestDispatcher( "/WEB-INF/contact.jsp" ).forward( request, response );
			}
		}catch(NullPointerException e){
			System.out.println("null pointer - contact");
			this.getServletContext().getRequestDispatcher( "/WEB-INF/contact.jsp" ).forward( request, response );
		}


		this.getServletContext().getRequestDispatcher( "/WEB-INF/contact.jsp" ).forward( request, response );
	}

}
