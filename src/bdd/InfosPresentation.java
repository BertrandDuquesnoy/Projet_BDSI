package bdd;

import javax.servlet.http.HttpServletRequest;

import beans.PresentationBean;

public class InfosPresentation {

	PresentationBean presBean;
	
	public InfosPresentation() {
		presBean = new PresentationBean();
	}
	
	public PresentationBean getInfos(HttpServletRequest request){
		//TODO: Requête SQL pour les champs de presBean
		// On va chercher où ces champs ??
		return presBean;
	}
}
