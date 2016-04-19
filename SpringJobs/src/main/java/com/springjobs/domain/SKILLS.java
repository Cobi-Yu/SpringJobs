package com.springjobs.domain;

public class SKILLS {
	int skno;
	String sknm;
	
	public SKILLS() {
		// TODO Auto-generated constructor stub
	}

	public SKILLS(int skno, String sknm) {
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
