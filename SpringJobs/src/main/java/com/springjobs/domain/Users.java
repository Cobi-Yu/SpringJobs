package com.springjobs.domain;

import java.sql.Date;
import java.util.List;

public class Users {
	
	private int uno;
	private String unm;
	private String uenm;
	private String uem;
	private String upw;
	private String uco;
	private String usx;
	private String ucnf;
	private Date ubd;
	private String upho;
	private String uadr;
	private String uurl;
	private String ures;
	private int cno;
	private List<UPhotos> uphots;
	private List<UTags> utags;
	private List<Uexps> upxps;
	private List<Uscls> uslcs;
	private List<Ucerts> ucerts;
	private List<Ulans> ulans;
	private List<UPjtNo> upjtno;
	private List<Skills> skills;
	private List<Cpjts> cpjts;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(int uno, String unm, String uenm, String uem, String upw, String uco, String usx, String ucnf,
			Date ubd, String upho, String uadr, String uurl, String ures, int cno, List<UPhotos> uphots,
			List<UTags> utags, List<Uexps> upxps, List<Uscls> uslcs, List<Ucerts> ucerts, List<Ulans> ulans,
			List<UPjtNo> upjtno, List<Skills> skills, List<Cpjts> cpjts) {
		super();
		this.uno = uno;
		this.unm = unm;
		this.uenm = uenm;
		this.uem = uem;
		this.upw = upw;
		this.uco = uco;
		this.usx = usx;
		this.ucnf = ucnf;
		this.ubd = ubd;
		this.upho = upho;
		this.uadr = uadr;
		this.uurl = uurl;
		this.ures = ures;
		this.cno = cno;
		this.uphots = uphots;
		this.utags = utags;
		this.upxps = upxps;
		this.uslcs = uslcs;
		this.ucerts = ucerts;
		this.ulans = ulans;
		this.upjtno = upjtno;
		this.skills = skills;
		this.cpjts = cpjts;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	public String getUenm() {
		return uenm;
	}

	public void setUenm(String uenm) {
		this.uenm = uenm;
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

	public String getUco() {
		return uco;
	}

	public void setUco(String uco) {
		this.uco = uco;
	}

	public String getUsx() {
		return usx;
	}

	public void setUsx(String usx) {
		this.usx = usx;
	}

	public String getUcnf() {
		return ucnf;
	}

	public void setUcnf(String ucnf) {
		this.ucnf = ucnf;
	}

	public Date getUbd() {
		return ubd;
	}

	public void setUbd(Date ubd) {
		this.ubd = ubd;
	}

	public String getUpho() {
		return upho;
	}

	public void setUpho(String upho) {
		this.upho = upho;
	}

	public String getUadr() {
		return uadr;
	}

	public void setUadr(String uadr) {
		this.uadr = uadr;
	}

	public String getUurl() {
		return uurl;
	}

	public void setUurl(String uurl) {
		this.uurl = uurl;
	}

	public String getUres() {
		return ures;
	}

	public void setUres(String ures) {
		this.ures = ures;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public List<UPhotos> getUphots() {
		return uphots;
	}

	public void setUphots(List<UPhotos> uphots) {
		this.uphots = uphots;
	}

	public List<UTags> getUtags() {
		return utags;
	}

	public void setUtags(List<UTags> utags) {
		this.utags = utags;
	}

	public List<Uexps> getUpxps() {
		return upxps;
	}

	public void setUpxps(List<Uexps> upxps) {
		this.upxps = upxps;
	}

	public List<Uscls> getUslcs() {
		return uslcs;
	}

	public void setUslcs(List<Uscls> uslcs) {
		this.uslcs = uslcs;
	}

	public List<Ucerts> getUcerts() {
		return ucerts;
	}

	public void setUcerts(List<Ucerts> ucerts) {
		this.ucerts = ucerts;
	}

	public List<Ulans> getUlans() {
		return ulans;
	}

	public void setUlans(List<Ulans> ulans) {
		this.ulans = ulans;
	}

	public List<UPjtNo> getUpjtno() {
		return upjtno;
	}

	public void setUpjtno(List<UPjtNo> upjtno) {
		this.upjtno = upjtno;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public List<Cpjts> getCpjts() {
		return cpjts;
	}

	public void setCpjts(List<Cpjts> cpjts) {
		this.cpjts = cpjts;
	}

	@Override
	public String toString() {
		return "Users [uno=" + uno + ", unm=" + unm + ", uenm=" + uenm + ", uem=" + uem + ", upw=" + upw + ", uco="
				+ uco + ", usx=" + usx + ", ucnf=" + ucnf + ", ubd=" + ubd + ", upho=" + upho + ", uadr=" + uadr
				+ ", uurl=" + uurl + ", ures=" + ures + ", cno=" + cno + ", uphots=" + uphots + ", utags=" + utags
				+ ", upxps=" + upxps + ", uslcs=" + uslcs + ", ucerts=" + ucerts + ", ulans=" + ulans + ", upjtno="
				+ upjtno + ", skills=" + skills + ", cpjts=" + cpjts + "]";
	}
	
	
} // end of class
