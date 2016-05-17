package com.springjobs.domain;

import java.sql.Date;

public class Unotify {
	private int notino;
	private String target;
	private String title;
	private String description;
	private String url;
	private String check;
	private Date regDate;
	private int uno;
	
	public Unotify() {
		// TODO Auto-generated constructor stub
	}

	public Unotify(int notino, String target, String title, String description, String url, String check, Date regDate,
			int uno) {
		super();
		this.notino = notino;
		this.target = target;
		this.title = title;
		this.description = description;
		this.url = url;
		this.check = check;
		this.regDate = regDate;
		this.uno = uno;
	}

	
	
	public int getNotino() {
		return notino;
	}

	public void setNotino(int notino) {
		this.notino = notino;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "Unotify [notino=" + notino + ", target=" + target + ", title=" + title + ", description=" + description
				+ ", url=" + url + ", check=" + check + ", regDate=" + regDate + ", uno=" + uno + "]";
	}

}
