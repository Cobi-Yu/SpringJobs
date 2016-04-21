package com.springjobs.domain;

public class Cphots {

	private int cphno;
	private String cph;
	private int cno;
	
	public Cphots() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cphots(int cphno, String cph, int cno) {
		super();
		this.cphno = cphno;
		this.cph = cph;
		this.cno = cno;
	}


	public int getCphno() {
		return cphno;
	}
	public void setCphno(int cphno) {
		this.cphno = cphno;
	}
	public String getCph() {
		return cph;
	}
	public void setCph(String cph) {
		this.cph = cph;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	@Override
	public String toString() {
		return "Cphots [cphno=" + cphno + ", cph=" + cph + ", cno=" + cno + "]";
	}
	

}
