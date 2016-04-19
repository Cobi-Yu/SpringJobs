package com.springjobs.domain;

import java.sql.Date;

public class Uexps {
	
	private int expno;
	private String expcn;
	private String expdn;
	private int exppy;
	private Date expsd;
	private Date exped;
	private String expwc;
	private String exppt;
	private int uno;	
	
	public Uexps() {
		// TODO Auto-generated constructor stub
	}

	public Uexps(int expno, String expcn, String expdn, int exppy, Date expsd, Date exped, String expwc, String exppt, int uno) {
		super();
		this.expno = expno;
		this.expcn = expcn;
		this.expdn = expdn;
		this.exppy = exppy;
		this.expsd = expsd;
		this.exped = exped;
		this.expwc = expwc;
		this.exppt = exppt;
		this.uno = uno;
	}

	public int getExpno() {
		return expno;
	}

	public void setExpno(int expno) {
		this.expno = expno;
	}

	public String getExpcn() {
		return expcn;
	}

	public void setExpcn(String expcn) {
		this.expcn = expcn;
	}

	public String getExpdn() {
		return expdn;
	}

	public void setExpdn(String expdn) {
		this.expdn = expdn;
	}

	public int getExppy() {
		return exppy;
	}

	public void setExppy(int exppy) {
		this.exppy = exppy;
	}

	public Date getExpsd() {
		return expsd;
	}

	public void setExpsd(Date expsd) {
		this.expsd = expsd;
	}

	public Date getExped() {
		return exped;
	}

	public void setExped(Date exped) {
		this.exped = exped;
	}

	public String getExpwc() {
		return expwc;
	}

	public void setExpwc(String expwc) {
		this.expwc = expwc;
	}

	public String getExppt() {
		return exppt;
	}

	public void setExppt(String exppt) {
		this.exppt = exppt;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "Uexps [expno=" + expno + ", expcn=" + expcn + ", expdn=" + expdn + ", exppy=" + exppy + ", expsd="
				+ expsd + ", exped=" + exped + ", expwc=" + expwc + ", exppt=" + exppt + ", uno=" + uno + "]";
	}
	
}
