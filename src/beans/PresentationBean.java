package beans;

import java.util.ArrayList;

public class PresentationBean {
	
	String pourquoi, comment, ou, quand;
	ArrayList<String> pays;
	
	public PresentationBean() {
		pourquoi = "null";
		comment = "null";
		ou  = "null";
		quand = "null";
		pays = new ArrayList<String>();
	}

	public String getPourquoi() {
		return pourquoi;
	}

	public void setPourquoi(String pourquoi) {
		this.pourquoi = pourquoi;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOu() {
		return ou;
	}

	public void setOu(String ou) {
		this.ou = ou;
	}

	public String getQuand() {
		return quand;
	}

	public void setQuand(String quand) {
		this.quand = quand;
	}

	public ArrayList<String> getPays() {
		return pays;
	}

	public void setPays(ArrayList<String> pays) {
		this.pays = pays;
	}

}
