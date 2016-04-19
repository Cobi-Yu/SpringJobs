package com.springjobs.domain;

import java.sql.Date;

public class PJTBDS {
	int pbno;
	String pbtl;
	String pbct;
	Date pbrd;
	String pbrg;
	String pbop;
	int cpjno;
	int uno;
	
	public PJTBDS() {
		// TODO Auto-generated constructor stub
	}

	public PJTBDS(int pbno, String pbtl, String pbct, Date pbrd, String pbrg, String pbop, int cpjno, int uno) {
		super();
		this.pbno = pbno;
		this.pbtl = pbtl;
		this.pbct = pbct;
		this.pbrd = pbrd;
		this.pbrg = pbrg;
		this.pbop = pbop;
		this.cpjno = cpjno;
		this.uno = uno;
	}

	public int getPbno() {
		return pbno;
	}

	public void setPbno(int pbno) {
		this.pbno = pbno;
	}

	public String getPbtl() {
		return pbtl;
	}

	public void setPbtl(String pbtl) {
		this.pbtl = pbtl;
	}

	public String getPbct() {
		return pbct;
	}

	public void setPbct(String pbct) {
		this.pbct = pbct;
	}

	public Date getPbrd() {
		return pbrd;
	}

	public void setPbrd(Date pbrd) {
		this.pbrd = pbrd;
	}

	public String getPbrg() {
		return pbrg;
	}

	public void setPbrg(String pbrg) {
		this.pbrg = pbrg;
	}

	public String getPbop() {
		return pbop;
	}

	public void setPbop(String pbop) {
		this.pbop = pbop;
	}

	public int getCpjno() {
		return cpjno;
	}

	public void setCpjno(int cpjno) {
		this.cpjno = cpjno;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "PJTBDS [pbno=" + pbno + ", pbtl=" + pbtl + ", pbct=" + pbct + ", pbrd=" + pbrd + ", pbrg=" + pbrg
				+ ", pbop=" + pbop + ", cpjno=" + cpjno + ", uno=" + uno + "]";
	}
	
	
}
