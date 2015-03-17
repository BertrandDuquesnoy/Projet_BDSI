package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.LdapConnect;
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
	try {
		System.out.println(request.getParameter("text_pass"));
			LdapConnectMdp.authentifier(request.getParameter("text_login"), request.getParameter("text_pass"));
	} catch (NullPointerException e) {
		System.out.println("null pointer - Login");
	}catch (LdapException e){
		System.out.println("ldap - Login");
	}
}

}
