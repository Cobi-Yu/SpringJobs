package com.springjobs.domain;

import java.sql.Date;

public class Uscls {

	private int scno;
	private String scnm;
	private String scmj;
	private int scgr;
	private Date scsd;
	private Date sced;
	private int uno;
	
	public Uscls() {
		// TODO Auto-generated constructor stub
	}

	public Uscls(int scno, String scnm, String scmj, int scgr, Date scsd, Date sced, int uno) {
		super();
		this.scno = scno;
		this.scnm = scnm;
		this.scmj = scmj;
		this.scgr = scgr;
		this.scsd = scsd;
		this.sced = sced;
		this.uno = uno;
	}

	public int getScno() {
		return scno;
	}

	public void setScno(int scno) {
		this.scno = scno;
	}

	public String getScnm() {
		return scnm;
	}

	public void setScnm(String scnm) {
		this.scnm = scnm;
	}

	public String getScmj() {
		return scmj;
	}

	public void setScmj(String scmj) {
		this.scmj = scmj;
	}

	public int getScgr() {
		return scgr;
	}

	public void setScgr(int scgr) {
		this.scgr = scgr;
	}

	public Date getScsd() {
		return scsd;
	}

	public void setScsd(Date scsd) {
		this.scsd = scsd;
	}

	public Date getSced() {
		return sced;
	}

	public void setSced(Date sced) {
		this.sced = sced;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "Uscls [scno=" + scno + ", scnm=" + scnm + ", scmj=" + scmj + ", scgr=" + scgr + ", scsd=" + scsd
				+ ", sced=" + sced + ", uno=" + uno + "]";
	}
	
}
