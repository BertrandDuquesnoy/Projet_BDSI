package bdd;


import java.util.ArrayList;

import beans.map.CarteBean;
import beans.map.PointCarteBean;

public class InfosCarte {

	CarteBean cb;
	
	public InfosCarte() {
		cb = new CarteBean();
	}
	
	public CarteBean getInfos(){
		//TODO: Requêtes pour récupérer toutes les universités, stages et ddiplomes avec les infos demandées dans les beans correspondants
		return cb;
	}
	
	public String getInfosSerialized(){
		String chaine = "";
		String temp = "";
		for (PointCarteBean p : this.getInfos().getPts()) {
			temp = p.getId()+"$£$"+p.getTitre()+"$£$"+p.getDescription()+"$£$"+p.getItem()+"$£$"+p.getLien()+"$£$"+p.getAdresse()+"$£$"+p.getType();
			chaine += temp+"&_&";
		}
		System.out.println(chaine);
		return chaine;
	}
}
