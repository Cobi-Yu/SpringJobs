package com.springjobs.domain;

import java.util.List;

public class UTags {

	private int uexno;
	private List<String> uextg;
	private int uno;

	public UTags() {
		// TODO Auto-generated constructor stub
	}




	public UTags(int uexno, List<String> uextg, int uno) {
		super();
		this.uexno = uexno;
		this.uextg = uextg;
		this.uno = uno;
	}

	public int getUexno() {
		return uexno;
	}

	public void setUexno(int uexno) {
		this.uexno = uexno;
	}

	public List<String> getUextg() {
		return uextg;
	}

	public void setUextg(List<String> uextg) {
		this.uextg = uextg;
	}
	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}


	@Override
	public String toString() {
		return "UTags [uexno=" + uexno + ", uextg=" + uextg + ", uno=" + uno + "]";
	}
	
	

} // end of class
