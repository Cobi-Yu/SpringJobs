package com.springjobs.domain;

import java.sql.Date;

public class Cpjts {

	 int cpjno;
	 String cpjnm;
	 String cpjint;
	 String cpjsk;
	 String cpjchk;
	 private String cpjyr;
	 int cpjnpl;
	 int cpjmnp;
	 int cpjmap;
	 private int cpjhtn;
	 Date cpjrd;
	 String cpjrg;
	 String cpjwt;
	 String cpjar;
	 
	 public Cpjts(){
		 
	 }
	 

	public Cpjts(int cpjno, String cpjnm, String cpjint, String cpjsk, String cpjchk, String cpjyr, int cpjnpl,
			int cpjmnp, int cpjmap, int cpjhtn, Date cpjrd, String cpjrg, String cpjwt, String cpjar) {
		super();
		this.cpjno = cpjno;
		this.cpjnm = cpjnm;
		this.cpjint = cpjint;
		this.cpjsk = cpjsk;
		this.cpjchk = cpjchk;
		this.cpjyr = cpjyr;
		this.cpjnpl = cpjnpl;
		this.cpjmnp = cpjmnp;
		this.cpjmap = cpjmap;
		this.cpjhtn = cpjhtn;
		this.cpjrd = cpjrd;
		this.cpjrg = cpjrg;
		this.cpjwt = cpjwt;
		this.cpjar = cpjar;
	}


	public int getCpjno() {
		return cpjno;
	}

	public void setCpjno(int cpjno) {
		this.cpjno = cpjno;
	}

	public String getCpjnm() {
		return cpjnm;
	}

	public void setCpjnm(String cpjnm) {
		this.cpjnm = cpjnm;
	}

	public String getCpjint() {
		return cpjint;
	}

	public void setCpjint(String cpjint) {
		this.cpjint = cpjint;
	}

	public String getCpjsk() {
		return cpjsk;
	}

	public void setCpjsk(String cpjsk) {
		this.cpjsk = cpjsk;
	}

	public String getCpjchk() {
		return cpjchk;
	}

	public void setCpjchk(String cpjchk) {
		this.cpjchk = cpjchk;
	}

	public String getCpjyr() {
		return cpjyr;
	}

	public void setCpjyr(String cpjyr) {
		this.cpjyr = cpjyr;
	}

	public int getCpjnpl() {
		return cpjnpl;
	}

	public void setCpjnpl(int cpjnpl) {
		this.cpjnpl = cpjnpl;
	}

	public int getCpjmnp() {
		return cpjmnp;
	}

	public void setCpjmnp(int cpjmnp) {
		this.cpjmnp = cpjmnp;
	}

	public int getCpjmap() {
		return cpjmap;
	}

	public void setCpjmap(int cpjmap) {
		this.cpjmap = cpjmap;
	}

	public int getCpjhtn() {
		return cpjhtn;
	}

	public void setCpjhtn(int cpjhtn) {
		this.cpjhtn = cpjhtn;
	}

	public Date getCpjrd() {
		return cpjrd;
	}

	public void setCpjrd(Date cpjrd) {
		this.cpjrd = cpjrd;
	}

	public String getCpjrg() {
		return cpjrg;
	}

	public void setCpjrg(String cpjrg) {
		this.cpjrg = cpjrg;
	}

	public String getCpjwt() {
		return cpjwt;
	}

	public void setCpjwt(String cpjwt) {
		this.cpjwt = cpjwt;
	}

	public String getCpjar() {
		return cpjar;
	}

	public void setCpjar(String cpjar) {
		this.cpjar = cpjar;
	}


	@Override
	public String toString() {
			return "Cpjts : [cpjno]"+cpjno+"[cpjnm]"+cpjnm+"[cpjint]"+cpjint+"[cpjsk]"+cpjsk+"[cpjchk]"
					+cpjchk+"[cpjyr]"+cpjyr+"[cpjnpl]"+cpjnpl+"[cpjmnp]"+cpjmnp+"[cpjmap]"+cpjmap+
					"[cpjhtn]"+cpjhtn+"[cpjrd]"+cpjrd+"[cpjrg]"+cpjrg+"[cpjwt]"+cpjwt+"[cpjar]"+cpjar;
	}
	 
	 
	 
	
}
