package com.springjobs.common;

import java.util.List;

public class Search {
	private List<String> cpjar;
	private List<Integer> cpjsk;
	private List<String> uextg;
	private int cpjmnp;
	private int cpjmap;
	private int cpjyr;
	
	public Search() {
		// TODO Auto-generated constructor stub
	}

	public Search(List<String> cpjar, List<String> uextg, List<Integer> cpjsk, int cpjmnp, int cpjmap, int cpjyr) {
		super();
		this.cpjar = cpjar;
		this.cpjsk = cpjsk;
		this.cpjmnp = cpjmnp;
		this.cpjmap = cpjmap;
		this.cpjyr = cpjyr;
		this.uextg = uextg;
	}

	public List<String> getCpjar() {
		return cpjar;
	}

	public void setCpjar(List<String> cpjar) {
		this.cpjar = cpjar;
	}
	public List<String> getUextg() {
		return uextg;
	}

	public void setUextg(List<String> uextg) {
		this.uextg = uextg;
	}
	public List<Integer> getCpjsk() {
		return cpjsk;
	}

	public void setCpjsk(List<Integer> cpjsk) {
		this.cpjsk = cpjsk;
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

	public int getCpjyr() {
		return cpjyr;
	}

	public void setCpjyr(int cpjyr) {
		this.cpjyr = cpjyr;
	}

	@Override
	public String toString() {
		return "Search [cpjar=" + cpjar + ",uextg=" + uextg + ", cpjsk=" + cpjsk + ", cpjmnp=" + cpjmnp + ", cpjmap=" + cpjmap + ", cpjyr="
				+ cpjyr + "]";
	}
	
	
}
