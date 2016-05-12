package com.springjobs.domain;

public class Upfurl {
	private int upfurlno;
	private String url;
	private int uno;
	
	public Upfurl() {
		// TODO Auto-generated constructor stub
	}

	public Upfurl(int upfurlno, String url, int uno) {
		super();
		this.upfurlno = upfurlno;
		this.url = url;
		this.uno = uno;
	}

	public int getUpfurlno() {
		return upfurlno;
	}

	public void setUpfurlno(int upfurlno) {
		this.upfurlno = upfurlno;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "Upfurl [upfurlno=" + upfurlno + ", url=" + url + ", uno=" + uno + "]";
	}
	
	
}
