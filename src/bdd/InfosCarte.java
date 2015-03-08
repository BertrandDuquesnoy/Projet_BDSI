package bdd;


import beans.map.CarteBean;

public class InfosCarte {

	CarteBean cb;
	
	public InfosCarte() {
		cb = new CarteBean();
	}
	
	public CarteBean getInfos(){
		//TODO: Requêtes pour récupérer toutes les universités, stages et ddiplomes avec les infos demandées dans les beans correspondants
		return cb;
	}
}
