package com.springjobs.dao.company;

import java.util.List;
import java.util.Map;

import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;
import com.springjobs.domain.Users;

public interface CompanyDao {
	
	public int addProject(Cpjts cpjts);

	public int addJob(Crecs crecs);
	
	public Cpjts getProjectView(int cpjno) throws Exception;
	
	public Crecs getJob(int reno) throws Exception ;

	public void addCompany(Cinfos cinfos);
	
	public void addProjectSkills(Cpjts cpjts);
	
	public List<Users> getJoinProjectUserList(Map<String, Object> map);
}
