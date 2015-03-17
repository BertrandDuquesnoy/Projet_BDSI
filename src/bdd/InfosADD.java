package bdd;

import beans.ADDBean;


public class InfosADD {

	ADDBean add;
	
	public InfosADD() {
		add = new ADDBean();
	}
	
	public ADDBean getInfos(){
		//TODO: requetes listant les infos de ADDBean pour tous les stages effectués
		return add;
	}
}
