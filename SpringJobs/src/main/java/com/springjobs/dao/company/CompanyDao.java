package com.springjobs.dao.company;

import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;

public interface CompanyDao {
	
	public int addProject(Cpjts cpjts);

	public int addJob(Crecs crecs);
	
	public Cpjts getProject(int cpjno) throws Exception;
	
	public Crecs getJob(int reno) throws Exception ;

	public void addCompany(Cinfos cinfos);
}
