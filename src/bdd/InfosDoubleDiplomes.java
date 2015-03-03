package bdd;

import beans.DoubleDiplomeBean;

public class InfosDoubleDiplomes {
	
	DoubleDiplomeBean ddBean;
	
	public InfosDoubleDiplomes(){
		ddBean = new DoubleDiplomeBean();
	}
	
	public DoubleDiplomeBean getInfos(){
		
		return ddBean;
	}

}
