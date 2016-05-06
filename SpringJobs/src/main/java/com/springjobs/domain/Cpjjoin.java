package com.springjobs.domain;

public class Cpjjoin {
	private int uno;
	private int cpjno;
	private String cpjconf;
	
	public Cpjjoin() {
		// TODO Auto-generated constructor stub
	}

	public Cpjjoin(int uno, int cpjno, String cpjconf) {
		super();
		this.uno = uno;
		this.cpjno = cpjno;
		this.cpjconf = cpjconf;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public int getCpjno() {
		return cpjno;
	}

	public void setCpjno(int cpjno) {
		this.cpjno = cpjno;
	}

	public String getCpjconf() {
		return cpjconf;
	}

	public void setCpjconf(String cpjconf) {
		this.cpjconf = cpjconf;
	}

	@Override
	public String toString() {
		return "Cpjjoin [uno=" + uno + ", cpjno=" + cpjno + ", cpjconf=" + cpjconf + "]";
	}
	
	
}
