package com.springjobs.domain;

public class UPhotos {

	private int phno;
	private String phot;
	private int uno;
	
	public UPhotos() {
		// TODO Auto-generated constructor stub
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getPhot() {
		return phot;
	}

	public void setPhot(String phot) {
		this.phot = phot;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	
	@Override
	public String toString() {
		return "UPhotos [phno=" + phno + ", phot=" + phot + ", uno=" + uno + "]";
	}
	
	
	

} // end of class
