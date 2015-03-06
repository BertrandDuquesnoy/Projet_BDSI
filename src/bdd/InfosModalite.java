package bdd;

import javax.servlet.http.HttpServletRequest;

import beans.ModaliteBean;

public class InfosModalite {

	ModaliteBean modBean;
	
	public InfosModalite() {
		modBean = new ModaliteBean();
	}
	
	public ModaliteBean getInfos(HttpServletRequest request){
		//TODO: Requête SQL de récupération des données de modalité
		return modBean;
	}
}
