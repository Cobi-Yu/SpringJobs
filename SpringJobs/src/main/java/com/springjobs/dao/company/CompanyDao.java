package com.springjobs.dao.company;

import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;

public interface CompanyDao {
	
	public void addProject(Cpjts cpjts);

	public void addJob(Crecs crecs);
	
	public Crecs getJob(int reno) throws Exception ;

}
