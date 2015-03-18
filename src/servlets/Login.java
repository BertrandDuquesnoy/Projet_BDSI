package servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bdd.InfosPersonne;
import beans.PersonBean;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

import modele.LdapConnectMdp;
import modele.LdapException;

public class Login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	try {
		if (request.getParameter("disconnect").equals("1")) {
			request.getSession().invalidate();
			this.getServletContext().getRequestDispatcher("/WEB-INF/forwardAccueil.jsp").forward(request, response);
		}
	} catch (NullPointerException e) {
		System.out.println("null pointer - Login");
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}
}

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	PersonBean pb = new PersonBean();
	try {
		try {
			pb = LdapConnectMdp.authentifier(request.getParameter("login"), request.getParameter("pass"));
		} catch (LdapException e) {
			e.printStackTrace();
		}
	} catch (NullPointerException e) {
		System.out.println("null pointer - Login");
	}
	
	if (pb != null) {
		HttpSession session = request.getSession();
//		pb.setPrenom("Paul");
//		pb.setNom("Cottin");
//		pb.setAnnee("2A");
//		pb.setMail("paulcottin@gmail.com");
		InfosPersonne infos = new InfosPersonne();
		pb = infos.infoPersonneByName(pb.getNom());
		session.setAttribute("user", pb);
		this.getServletContext().getRequestDispatcher("/WEB-INF/forwardAccueil.jsp").forward(request, response);
	}
	else{
		//TODO: Mettre un paramètre pour indiquer que c'est faux
		this.getServletContext().getRequestDispatcher( "/WEB-INF/connexion.jsp" ).forward( request, response );
	}
}

}
