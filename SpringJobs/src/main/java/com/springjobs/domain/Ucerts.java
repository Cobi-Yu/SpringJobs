package com.springjobs.domain;

import java.sql.Date;

public class Ucerts {

	private int ctno;
	private String ctnm;
	private String ctag;
	private int ctuqno;
	private int ctsc;
	private String cturl;
	private Date ctdy;
	private Date ctsd;
	private Date cted;
	private int uno;
	
	public Ucerts() {
		// TODO Auto-generated constructor stub
	}
		
	public Ucerts(int ctno, String ctnm, String ctag, int ctuqno, int ctsc, String cturl, Date ctdy, Date ctsd, Date cted, int uno) {
		super();
		this.ctno = ctno;
		this.ctnm = ctnm;
		this.ctag = ctag;
		this.ctuqno = ctuqno;
		this.ctsc = ctsc;
		this.cturl = cturl;
		this.ctdy = ctdy;
		this.ctsd = ctsd;
		this.cted = cted;
		this.uno = uno;
	}

	public int getCtno() {
		return ctno;
	}

	public void setCtno(int ctno) {
		this.ctno = ctno;
	}

	public String getCtnm() {
		return ctnm;
	}

	public void setCtnm(String ctnm) {
		this.ctnm = ctnm;
	}

	public String getCtag() {
		return ctag;
	}

	public void setCtag(String ctag) {
		this.ctag = ctag;
	}

	public int getCtuqno() {
		return ctuqno;
	}

	public void setCtuqno(int ctuqno) {
		this.ctuqno = ctuqno;
	}

	public int getCtsc() {
		return ctsc;
	}

	public void setCtsc(int ctsc) {
		this.ctsc = ctsc;
	}

	public String getCturl() {
		return cturl;
	}

	public void setCturl(String cturl) {
		this.cturl = cturl;
	}

	public Date getCtdy() {
		return ctdy;
	}

	public void setCtdy(Date ctdy) {
		this.ctdy = ctdy;
	}

	public Date getCtsd() {
		return ctsd;
	}

	public void setCtsd(Date ctsd) {
		this.ctsd = ctsd;
	}

	public Date getCted() {
		return cted;
	}

	public void setCted(Date cted) {
		this.cted = cted;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "Ucerts [ctno=" + ctno + ", ctnm=" + ctnm + ", ctag=" + ctag + ", ctuqno=" + ctuqno + ", ctsc=" + ctsc
				+ ", cturl=" + cturl + ", uno=" + uno + "]";
	}
	
}
