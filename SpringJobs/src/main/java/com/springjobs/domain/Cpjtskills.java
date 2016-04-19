package com.springjobs.domain;

public class Cpjtskills {

	int cpjno;
	int skno;
	
	public Cpjtskills(){
		
	}
	
	public Cpjtskills(int cpjno, int skno) {
		super();
		this.cpjno = cpjno;
		this.skno = skno;
	}

	public int getCpjno() {
		return cpjno;
	}

	public void setCpjno(int cpjno) {
		this.cpjno = cpjno;
	}

	public int getSkno() {
		return skno;
	}

	public void setSkno(int skno) {
		this.skno = skno;
	}

	@Override
	public String toString() {
		return "Cpjtskills : [cpjno]"+cpjno+"[skno]"+skno;
	}
	
	
}
