package com.springjobs.domain;

import java.sql.Date;

public class REBDS {
	int rbno;
	String rbtl;
	String rbct;
	Date rbrd;
	String rbrg;
	String rbop;
	int reno;
	int uno;
	
	public REBDS() {
		// TODO Auto-generated constructor stub
	}

	public REBDS(int rbno, String rbtl, String rbct, Date rbrd, String rbrg, String rbop, int reno, int uno) {
		super();
		this.rbno = rbno;
		this.rbtl = rbtl;
		this.rbct = rbct;
		this.rbrd = rbrd;
		this.rbrg = rbrg;
		this.rbop = rbop;
		this.reno = reno;
		this.uno = uno;
	}

	public int getRbno() {
		return rbno;
	}

	public void setRbno(int rbno) {
		this.rbno = rbno;
	}

	public String getRbtl() {
		return rbtl;
	}

	public void setRbtl(String rbtl) {
		this.rbtl = rbtl;
	}

	public String getRbct() {
		return rbct;
	}

	public void setRbct(String rbct) {
		this.rbct = rbct;
	}

	public Date getRbrd() {
		return rbrd;
	}

	public void setRbrd(Date rbrd) {
		this.rbrd = rbrd;
	}

	public String getRbrg() {
		return rbrg;
	}

	public void setRbrg(String rbrg) {
		this.rbrg = rbrg;
	}

	public String getRbop() {
		return rbop;
	}

	public void setRbop(String rbop) {
		this.rbop = rbop;
	}

	public int getReno() {
		return reno;
	}

	public void setReno(int reno) {
		this.reno = reno;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "REBDS [rbno=" + rbno + ", rbtl=" + rbtl + ", rbct=" + rbct + ", rbrd=" + rbrd + ", rbrg=" + rbrg
				+ ", rbop=" + rbop + ", reno=" + reno + ", uno=" + uno + "]";
	}

	
}
