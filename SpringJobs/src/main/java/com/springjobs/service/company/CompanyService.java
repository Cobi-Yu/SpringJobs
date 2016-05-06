package com.springjobs.service.company;


import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;

public interface CompanyService {
	
	public int addProject(Cpjts cpjts);
	
	public int addJob(Crecs crecs);
	
	public Cpjts getProject(int cpjno) throws Exception;
	
	public void addProjectSkills(Cpjts cpjts);
	
	public Crecs getJob(int reno) throws Exception ;
	
	public void addCompany(Cinfos cinfos);
}
