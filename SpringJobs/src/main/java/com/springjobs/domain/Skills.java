package com.springjobs.domain;

public class Skills {
	private int skno;
	private String sknm;
	
	public Skills() {
		// TODO Auto-generated constructor stub
	}

	public Skills(int skno, String sknm) {
		super();
		this.skno = skno;
		this.sknm = sknm;
	}

	public int getSkno() {
		return skno;
	}

	public void setSkno(int skno) {
		this.skno = skno;
	}

	public String getSknm() {
		return sknm;
	}

	public void setSknm(String sknm) {
		this.sknm = sknm;
	}

	@Override
	public String toString() {
		return "SKILLS [skno=" + skno + ", sknm=" + sknm + "]";
	}
	
	
}
