package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.InfosStage;

public class Stage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	InfosStage infos_stage;
	
    public Stage() {
        super();
        this.infos_stage = new InfosStage();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("st", infos_stage.getInfos());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/stage2.jsp" ).forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
