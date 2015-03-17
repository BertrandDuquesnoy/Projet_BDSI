package bdd;

import beans.AUnivBean;

public class InfosAUniv {

	AUnivBean av;
	
	public InfosAUniv() {
		av = new AUnivBean();
	}
	
	public AUnivBean getInfos(){
		//TODO: requetes listant les infos de AUnivBean pour tous les stages effectués
		return av;
	}
}
