package beans.map;

import java.util.ArrayList;

public class CarteBean {

	private ArrayList<PointCarteBean> pts;
	private int nbPts;
	
	public CarteBean() {
		pts = new ArrayList<PointCarteBean>();
		pts.add(new PointCarteBean());
		pts.add(new PointCarteBean());
		pts.get(1).setTitre("autre univ");
		pts.get(1).setAdresse("Lyon");
		nbPts = 1;
	}
	
	public int getNbPts(){
		return pts.size();
	}

	public void setNbPts(int nbPts) {
		this.nbPts = nbPts;
	}

	public ArrayList<PointCarteBean> getPts() {
		return pts;
	}

	public void setPts(ArrayList<PointCarteBean> pts) {
		this.pts = pts;
	}
}
