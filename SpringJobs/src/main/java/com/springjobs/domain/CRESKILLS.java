package com.springjobs.domain;

public class CRESKILLS {
	int reno;
	int skno;
	
	public CRESKILLS(int reno, int skno) {
		super();
		this.reno = reno;
		this.skno = skno;
	}

	public int getReno() {
		return reno;
	}

	public void setReno(int reno) {
		this.reno = reno;
	}

	public int getSkno() {
		return skno;
	}

	public void setSkno(int skno) {
		this.skno = skno;
	}

	@Override
	public String toString() {
		return "CRESKILLS [reno=" + reno + ", skno=" + skno + "]";
	}
	
}
