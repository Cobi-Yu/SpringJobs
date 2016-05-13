package com.springjobs.service.company;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;
import com.springjobs.domain.Uexps;
import com.springjobs.domain.Users;

public interface CompanyService {
	
	public int addProject(Cpjts cpjts);
	
	public Cinfos getComp(int uno) throws Exception;

	public void addComp(Cinfos cinfos);
	
	public int addJob(Crecs crecs);
	
	public Cpjts getProjectView(int cpjno) throws Exception;
	
	public void addProjectSkills(Cpjts cpjts);
	
	public Crecs getJob(int reno) throws Exception ;
	
	public void addCompany(Cinfos cinfos);
	
	public List<Users> getJoinProjectUserList(Map<String, Object> map);
	
	public int confirmProjectUser(HashMap<String, Integer> map);
}
