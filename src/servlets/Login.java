package servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
}

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	boolean connected = false;
	String prenom  = "paul", nom = "cottin";
	try {
		try {
			connected = LdapConnectMdp.authentifier(request.getParameter("text_login"), request.getParameter("text_pass"));
		} catch (LdapException e) {
			e.printStackTrace();
		}
	} catch (NullPointerException e) {
		System.out.println("null pointer - Login");
	}
	
	if (connected) {
		HttpSession session = request.getSession();
		PersonBean pb = new PersonBean();
		pb.setPrenom("Paul");
		pb.setNom("Cottin");
		pb.setAnnee("2A");
		pb.setFonction("Etudiant");
		pb.setMail("paulcottin@gmail.com");
		session.setAttribute("user", pb);
		this.getServletContext().getRequestDispatcher("/WEB-INF/forwardAccueil.jsp").forward(request, response);
	}
	else{
		//TODO: Mettre un paramètre pour indiquer que c'est faux
		this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
	}
}

}
