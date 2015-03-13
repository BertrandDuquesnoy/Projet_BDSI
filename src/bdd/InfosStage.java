package bdd;

import beans.StageBean;

public class InfosStage {
	
	StageBean sb;
	
	public InfosStage() {
		sb = new StageBean();
	}
	
	public StageBean getInfos(){
		//TODO: requêtes SQL pour récupérer les infos du site
		return sb;
	}
	
	public void setInfos(StageBean sb){
		//TODO: requêtes SQL pour updater la bdd avec les données de sb
	}

}
