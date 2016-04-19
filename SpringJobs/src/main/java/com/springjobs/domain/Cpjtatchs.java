package com.springjobs.domain;

public class Cpjtatchs {
	
	int cpjfno;
	String cpjfnm;
	int cpjno;
	
	public Cpjtatchs(){
		
	}

	public Cpjtatchs(int cpjfno, String cpjfnm, int cpjno) {
		super();
		this.cpjfno = cpjfno;
		this.cpjfnm = cpjfnm;
		this.cpjno = cpjno;
	}

	public int getCpjfno() {
		return cpjfno;
	}

	public void setCpjfno(int cpjfno) {
		this.cpjfno = cpjfno;
	}

	public String getCpjfnm() {
		return cpjfnm;
	}

	public void setCpjfnm(String cpjfnm) {
		this.cpjfnm = cpjfnm;
	}

	public int getCpjno() {
		return cpjno;
	}

	public void setCpjno(int cpjno) {
		this.cpjno = cpjno;
	}

	@Override
	public String toString() {
		return "Cpjtatchs : [cpjfno]"+cpjfno+"[cpjfnm]"+cpjfnm+"[cpjno]"+cpjno;
	}
	
}
