package com.springjobs.domain;
//채용공고 첨부파일
public class Cinfos {
	private int cno;
	private int uno;
	private String cct;
	private int crgno;
	private String cnm;
	private String cscl;
	private String clo;
	private int cnpl;
	private String cint;
	
	public Cinfos() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Cinfos(int cno, int uno, String cct, int crgno, String cnm, String cscl, String clo, int cnpl, String cint) {
		super();
		this.cno = cno;
		this.uno = uno;
		this.cct = cct;
		this.crgno = crgno;
		this.cnm = cnm;
		this.cscl = cscl;
		this.clo = clo;
		this.cnpl = cnpl;
		this.cint = cint;
	}



	public int getCno() {
		return cno;
	}



	public void setCno(int cno) {
		this.cno = cno;
	}



	public int getUno() {
		return uno;
	}



	public void setUno(int uno) {
		this.uno = uno;
	}



	public String getCct() {
		return cct;
	}



	public void setCct(String cct) {
		this.cct = cct;
	}



	public int getCrgno() {
		return crgno;
	}



	public void setCrgno(int crgno) {
		this.crgno = crgno;
	}



	public String getCnm() {
		return cnm;
	}



	public void setCnm(String cnm) {
		this.cnm = cnm;
	}



	public String getCscl() {
		return cscl;
	}



	public void setCscl(String cscl) {
		this.cscl = cscl;
	}



	public String getClo() {
		return clo;
	}



	public void setClo(String clo) {
		this.clo = clo;
	}



	public int getCnpl() {
		return cnpl;
	}



	public void setCnpl(int cnpl) {
		this.cnpl = cnpl;
	}



	public String getCint() {
		return cint;
	}



	public void setCint(String cint) {
		this.cint = cint;
	}



	@Override
	public String toString() {
		return "Cinfos [cno=" + cno + ", uno=" + uno + ", cct=" + cct + ", crgno=" + crgno + ", cnm=" + cnm + ", cscl="
				+ cscl + ", clo=" + clo + ", cnpl=" + cnpl + ", cint=" + cint + "]";
	}

	


}
