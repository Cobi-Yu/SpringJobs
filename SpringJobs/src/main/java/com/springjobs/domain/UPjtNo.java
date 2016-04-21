package com.springjobs.domain;

public class UPjtNo {

	private int pjno;
	private int uno;
	private String pjnm;
	private String pjsd;
	private String pjed;
	private String pjdt;
	private String pjpy;
	
	
	public UPjtNo() {
		// TODO Auto-generated constructor stub
	}

	

	public UPjtNo(int pjno, int uno, String pjnm, String pjsd, String pjed, String pjdt, String pjpy) {
		super();
		this.pjno = pjno;
		this.uno = uno;
		this.pjnm = pjnm;
		this.pjsd = pjsd;
		this.pjed = pjed;
		this.pjdt = pjdt;
		this.pjpy = pjpy;
	}



	public int getPjno() {
		return pjno;
	}


	public void setPjno(int pjno) {
		this.pjno = pjno;
	}


	public int getUno() {
		return uno;
	}


	public void setUno(int uno) {
		this.uno = uno;
	}


	public String getPjnm() {
		return pjnm;
	}


	public void setPjnm(String pjnm) {
		this.pjnm = pjnm;
	}


	public String getPjsd() {
		return pjsd;
	}


	public void setPjsd(String pjsd) {
		this.pjsd = pjsd;
	}


	public String getPjed() {
		return pjed;
	}


	public void setPjed(String pjed) {
		this.pjed = pjed;
	}


	public String getPjdt() {
		return pjdt;
	}


	public void setPjdt(String pjdt) {
		this.pjdt = pjdt;
	}


	public String getPjpy() {
		return pjpy;
	}


	public void setPjpy(String pjpy) {
		this.pjpy = pjpy;
	}


	@Override
	public String toString() {
		return "UPjtNo [pjno=" + pjno + ", uno=" + uno + ", pjnm=" + pjnm + ", pjsd=" + pjsd + ", pjed=" + pjed
				+ ", pjdt=" + pjdt + ", pjpy=" + pjpy + "]";
	}

	
	

} // end of class
