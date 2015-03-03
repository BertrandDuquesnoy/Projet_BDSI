package servlets;

import java.io.IOException;
import java.util.Map;

import javax.lang.model.element.NestingKind;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosPersonne;
import bdd.InfosUniversity;
import beans.UniversityBean;

public class University extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosUniversity infos_univ;
	InfosPersonne infos_pers;
	
	public University(){
		infos_univ = new InfosUniversity();
		infos_pers = new InfosPersonne();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("personne", infos_pers.infoPersonne(request));
		request.setAttribute("university", infos_univ.getinfos(request));

		try{
			if (request.getParameter("modif").equals("1")) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/university_modif.jsp").forward(request, response);
			}else{
				this.getServletContext().getRequestDispatcher( "/WEB-INF/university.jsp" ).forward( request, response );
			}
		}catch(NullPointerException e){
			this.getServletContext().getRequestDispatcher( "/WEB-INF/university.jsp" ).forward( request, response );
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String id = request.getParameter("id");
		String nom = request.getParameter("nom_universite");
		String url = request.getParameter("url");
		String type = request.getParameter("type");
		String ville = request.getParameter("ville");
		String pays = request.getParameter("pays");
		String langue = request.getParameter("langue");
		String dateFondation = request.getParameter("dateFondation");
		String nbEtudiants = request.getParameter("nbEtudiants");
		String convention_path = request.getParameter("convention_path");
		String facebook_link = request.getParameter("facebook_link");
		String twitter_link = request.getParameter("twitter_link");
		String linkedin_link = request.getParameter("linkedin_link");
		String description = request.getParameter("description");
				
		UniversityBean univModif = new UniversityBean();
		
		univModif.setId(Integer.valueOf(id));
		univModif.setNom(nom);
		univModif.setUrl(url);
		univModif.setType(type);
		univModif.setVille(ville);
		univModif.setPays(pays);
		univModif.setLangue(langue);
		univModif.setDateFondation(dateFondation);
		univModif.setNbEtudiants(Integer.valueOf(nbEtudiants));
		univModif.setConvention_path(convention_path);
		univModif.setFacebook_link(facebook_link);
		univModif.setTwitter_link(twitter_link);
		univModif.setLinkedin_link(linkedin_link);
		univModif.setDescription(description);
		
		infos_univ.setInfo(univModif);
		request.setAttribute("university", univModif);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/university.jsp").forward( request, response );	
	}
}
