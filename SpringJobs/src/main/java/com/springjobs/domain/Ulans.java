package com.springjobs.domain;

public class Ulans {

	private int lgno;
	private String lgnm;
	private String lglyl;
	private int uno;
	
	public Ulans() {
		// TODO Auto-generated constructor stub
	}

	public Ulans(int lgno, String lgnm, String lglyl, int uno) {
		super();
		this.lgno = lgno;
		this.lgnm = lgnm;
		this.lglyl = lglyl;
		this.uno = uno;
	}

	public int getLgno() {
		return lgno;
	}

	public void setLgno(int lgno) {
		this.lgno = lgno;
	}

	public String getLgnm() {
		return lgnm;
	}

	public void setLgnm(String lgnm) {
		this.lgnm = lgnm;
	}

	public String getLglyl() {
		return lglyl;
	}

	public void setLglyl(String lglyl) {
		this.lglyl = lglyl;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "Ulans [lgno=" + lgno + ", lgnm=" + lgnm + ", lglyl=" + lglyl + ", uno=" + uno + "]";
	}
	
}
