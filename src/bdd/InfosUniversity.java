package bdd;


import javax.servlet.http.HttpServletRequest;

import beans.UniversityBean;

public class InfosUniversity {

	UniversityBean university;
	
	public InfosUniversity(){
		this.university = new UniversityBean();
	}
	
	public UniversityBean infosUniversity(HttpServletRequest request){
		
		return university;
		
	}
}
