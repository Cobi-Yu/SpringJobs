package com.springjobs.domain;

import java.sql.Date;
import java.util.List;

public class Cpjts {

	 private int cpjno;
	 private String cpjnm;
	 private String cpjint;
	 private List<String> cpjsk;
	 private String cpjchk;
	 private int cpjyr;
	 private int cpjnpl;
	 private int cpjmnp;
	 private int cpjmap;
	 private int cpjhtn;
	 private Date cpjrd;
	 private Date cpjed;
	 private Date cpjsd;
	 private String cpjrg;
	 private String cpjwt;
	 private String cpjar;
	 private int cno;
	 
	public Cpjts() {
		// TODO Auto-generated constructor stub
	}

	public Cpjts(int cpjno, String cpjnm, String cpjint, List<String> cpjsk, String cpjchk, int cpjyr, int cpjnpl,
			int cpjmnp, int cpjmap, int cpjhtn, Date cpjrd, Date cpjed, Date cpjsd, String cpjrg, String cpjwt,
			String cpjar, int cno) {
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
		this.cpjed = cpjed;
		this.cpjsd = cpjsd;
		this.cpjrg = cpjrg;
		this.cpjwt = cpjwt;
		this.cpjar = cpjar;
		this.cno = cno;
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

	public List<String> getCpjsk() {
		return cpjsk;
	}

	public void setCpjsk(List<String> cpjsk) {
		this.cpjsk = cpjsk;
	}

	public String getCpjchk() {
		return cpjchk;
	}

	public void setCpjchk(String cpjchk) {
		this.cpjchk = cpjchk;
	}

	public int getCpjyr() {
		return cpjyr;
	}

	public void setCpjyr(int cpjyr) {
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

	public Date getCpjed() {
		return cpjed;
	}

	public void setCpjed(Date cpjed) {
		this.cpjed = cpjed;
	}

	public Date getCpjsd() {
		return cpjsd;
	}

	public void setCpjsd(Date cpjsd) {
		this.cpjsd = cpjsd;
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

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "Cpjts [cpjno=" + cpjno + ", cpjnm=" + cpjnm + ", cpjint=" + cpjint + ", cpjsk=" + cpjsk + ", cpjchk="
				+ cpjchk + ", cpjyr=" + cpjyr + ", cpjnpl=" + cpjnpl + ", cpjmnp=" + cpjmnp + ", cpjmap=" + cpjmap
				+ ", cpjhtn=" + cpjhtn + ", cpjrd=" + cpjrd + ", cpjed=" + cpjed + ", cpjsd=" + cpjsd + ", cpjrg="
				+ cpjrg + ", cpjwt=" + cpjwt + ", cpjar=" + cpjar + ", cno=" + cno + "]";
	}
	 
	
}
