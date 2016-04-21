package com.springjobs.domain;
//채용공고 첨부파일
public class Creatchs {
	private int refno;
	private String refnm;
	private int reno;
	
	public Creatchs() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Creatchs(int refno, String refnm, int reno) {
		super();
		this.refno = refno;
		this.refnm = refnm;
		this.reno = reno;
	}


	public int getRefno() {
		return refno;
	}
	public void setRefno(int refno) {
		this.refno = refno;
	}
	public String getRefnm() {
		return refnm;
	}
	public void setRefnm(String refnm) {
		this.refnm = refnm;
	}
	public int getReno() {
		return reno;
	}
	public void setReno(int reno) {
		this.reno = reno;
	}
	
	@Override
	public String toString() {
		return "Creatchs [refno=" + refno + ", refnm=" + refnm + ", reno=" + reno + "]";
	}
	

}
