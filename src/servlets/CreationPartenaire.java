package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosCreationPartenaire;
import beans.CreationPartenaireBean;

public class CreationPartenaire extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	InfosCreationPartenaire infos_part;
	
	public CreationPartenaire(){
		infos_part = new InfosCreationPartenaire();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		CreationPartenaireBean partAdd = new CreationPartenaireBean();
		partAdd.setNom(request.getParameter("nom"));
		partAdd.setPays(request.getParameter("pays"));
		partAdd.setAdresse(request.getParameter("adresse"));
		partAdd.setVille(request.getParameter("ville"));
		partAdd.setLogo_path(request.getParameter("logo_path"));
		partAdd.setType(request.getParameter("type"));
		partAdd.setLangue(request.getParameter("langue"));
		partAdd.setDate_creation(request.getParameter("date_creation"));
		partAdd.setNb_etudiant(Integer.valueOf(request.getParameter("nb_etudiant")));
		partAdd.setDescription(request.getParameter("description"));
		partAdd.setDoub_dip(request.getParameter("doub_dip"));
		
		infos_part.infoCreationPartenaire(partAdd.getNom(),partAdd.getPays(),partAdd.getAdresse(),partAdd.getVille(),partAdd.getLogo_path(),
				partAdd.getType(),partAdd.getLangue(),partAdd.getDate_creation(),partAdd.getDescription(),partAdd.getDoub_dip(),partAdd.getNb_etudiant());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/forwardAccueil.jsp").forward(request, response);
	}
}
