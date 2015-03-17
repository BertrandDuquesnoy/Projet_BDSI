/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import modele.LdapException;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.PersonBean;

/**
 *
 * @author Administrateur
 */
public class PersonServlet extends HttpServlet {

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 * 
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String unlog = request.getParameter("unlog");
		if (unlog != null && unlog.compareTo("1") == 0) {
			session.removeAttribute("userId");
			session.removeAttribute("userGroup");
			session.setAttribute("message", "Logout r�ussi.");
			response.sendRedirect("index.jsp");
		} else if (request.getMethod().equals("POST")
				&& (request.getParameter("action").compareTo("login") == 0)) {
			PersonBean user = new PersonBean();
			// Person user = new Person();
			// user.setLogin(request.getParameter("text_login"));
			// try {
			// if (user.login(request.getParameter("text_pass"))) {
			// session.setAttribute("userId", user.getId());
			// session.setAttribute("userGroup", user.getIdGroup());
			// session.setAttribute("message", "Login r�ussi.");
			// //redirige vers profile si premiere connection
			// if (user.getFirstName().compareTo("null")==0 ||
			// user.getFirstName()== null) {
			// session.setAttribute("message",
			// "Premier login r�ussi. Veuillez mettre � jour votre profil.");
			// response.sendRedirect("editPerson.jsp?id="+user.getId());
			// } else {
			// response.sendRedirect(request.getParameter("goback"));
			// }
			// } else {
			// session.setAttribute("message", "Login rat�.");
			// response.sendRedirect(request.getParameter("goback"));
			// }
			// } catch (UnsupportedEncodingException ex) {
			// Logger.getLogger(PersonServlet.class.getName()).log(Level.SEVERE,
			// null, ex);
			// } catch (LdapException ex) {
			// Logger.getLogger(PersonServlet.class.getName()).log(Level.SEVERE,
			// null, ex);
			// }

		}
	}

	// <editor-fold defaultstate="collapsed"
	// desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 * 
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 * 
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 * 
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>
}
