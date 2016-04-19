package com.springjobs.domain;
//채용공고 첨부파일
public class Cinfos {
	private int cno;
	private String cct;
	private int crgno;
	private String cnm;
	private String cscl;
	private String clo;
	private int cnpl;
	private String cint;
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
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
		return "Cinfos [cno=" + cno + ", cct=" + cct + ", crgno=" + crgno + ", cnm=" + cnm + ", cscl=" + cscl + ", clo="
				+ clo + ", cnpl=" + cnpl + ", cint=" + cint + "]";
	}


}
