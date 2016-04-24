package com.springjobs.service.company;

import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;

public interface CompanyService {
	
	public void addProject(Cpjts cpjts);
	
	public void addJob(Crecs crecs);
	
	public Crecs getJob(int reno) throws Exception ;
	
	public void addCompany(Cinfos cinfos);
}
