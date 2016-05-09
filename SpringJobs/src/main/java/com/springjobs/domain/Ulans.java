package com.springjobs.domain;

public class Ulans {

	private int lgno;
	private String lgnm;
	private String lglvl;
	private int uno;
	
	public Ulans() {
		// TODO Auto-generated constructor stub
	}

	public Ulans(int lgno, String lgnm, String lglvl, int uno) {
		super();
		this.lgno = lgno;
		this.lgnm = lgnm;
		this.lglvl = lglvl;
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

	public String getLglvl() {
		return lglvl;
	}

	public void setLglyl(String lglvl) {
		this.lglvl = lglvl;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "Ulans [lgno=" + lgno + ", lgnm=" + lgnm + ", lglvl=" + lglvl + ", uno=" + uno + "]";
	}
	
}
