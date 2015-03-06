package bdd;


import javax.servlet.http.HttpServletRequest;

import beans.UniversityBean;

public class InfosUniversity {

	UniversityBean university;
	
	public InfosUniversity(){
		this.university = new UniversityBean();
	}
	
	public UniversityBean getinfos(HttpServletRequest request){
		//TODO: Mise à jour des données du bean à partir de la base
		return university;
	}
	
	public void setInfo(UniversityBean univBean){
		//TODO: Reqête SQL de mise à jour des données de la base à partir du bean
	}
}
