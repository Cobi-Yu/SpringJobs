package com.springjobs.domain;

public class User {
	private int uno;
	private String uem;
	private String upw;
	private String unm;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int uno, String uem, String upw, String unm) {
		super();
		this.uno = uno;
		this.uem = uem;
		this.upw = upw;
		this.unm = unm;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public String getUem() {
		return uem;
	}

	public void setUem(String uem) {
		this.uem = uem;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}



	

	
}
