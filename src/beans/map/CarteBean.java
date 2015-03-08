package beans.map;

import java.util.ArrayList;

public class CarteBean {

	private ArrayList<DDCarteBean> ddCarte;
	private ArrayList<StageCarteBean> stageCarte;
	private ArrayList<UnivCarteBean> univCarte;
	private int nbDD, nbStage, nbUniv;
	
	public CarteBean() {
		ddCarte = new ArrayList<DDCarteBean>();
		ddCarte.add(new DDCarteBean());
		stageCarte = new ArrayList<StageCarteBean>();
		stageCarte.add(new StageCarteBean());
		univCarte = new ArrayList<UnivCarteBean>();
		univCarte.add(new UnivCarteBean());
		nbDD = 1;
		nbStage = 1;
		nbUniv = 1;
	}

	public ArrayList<DDCarteBean> getDdCarte() {
		return ddCarte;
	}

	public void setDdCarte(ArrayList<DDCarteBean> ddCarte) {
		this.ddCarte = ddCarte;
	}

	public ArrayList<StageCarteBean> getStageCarte() {
		return stageCarte;
	}

	public void setStageCarte(ArrayList<StageCarteBean> stageCarte) {
		this.stageCarte = stageCarte;
	}

	public ArrayList<UnivCarteBean> getUnivCarte() {
		return univCarte;
	}

	public void setUnivCarte(ArrayList<UnivCarteBean> univCarte) {
		this.univCarte = univCarte;
	}

	public int getNbDD() {
		return ddCarte.size();
	}

	public void setNbDD(int nbDD) {
		this.nbDD = nbDD;
	}

	public int getNbStage() {
		return stageCarte.size();
	}

	public void setNbStage(int nbStage) {
		this.nbStage = nbStage;
	}

	public int getNbUniv() {
		return univCarte.size();
	}

	public void setNbUniv(int nbUniv) {
		this.nbUniv = nbUniv;
	}
}
