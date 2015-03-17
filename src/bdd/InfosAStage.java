package bdd;

import beans.AStageBean;

public class InfosAStage {

	AStageBean as;
	
	public InfosAStage() {
		as = new AStageBean();
	}
	
	public AStageBean getInfos(){
		//TODO: requetes listant les infos de AStageBean pour tous les stages effectués
		return as;
	}
}
