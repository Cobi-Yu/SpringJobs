package com.springjobs.domain;

public class Yskills {
	private int ysno;
	private int uno;
	private int skno;
	private String ysyr;
	
	public Yskills() {
		// TODO Auto-generated constructor stub
	}

	public int getYsno() {
		return ysno;
	}

	public void setYsno(int ysno) {
		this.ysno = ysno;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public int getSkno() {
		return skno;
	}

	public void setSkno(int skno) {
		this.skno = skno;
	}

	public String getYsyr() {
		return ysyr;
	}

	public void setYsyr(String ysyr) {
		this.ysyr = ysyr;
	}

	@Override
	public String toString() {
		return "YSKILLS [ysno=" + ysno + ", uno=" + uno + ", skno=" + skno + ", ysyr=" + ysyr + "]";
	}
	
	
}
