package com.springjobs.service.company.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.dao.company.CompanyDao;
import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;
import com.springjobs.domain.Users;
import com.springjobs.service.company.CompanyService;

@Service("companyServiceImpl")
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	@Qualifier("companyDaoImpl")
	
	private CompanyDao companyDao;
	
	public int addProject(Cpjts cpjts){
		return companyDao.addProject(cpjts);
	}
	public int addJob(Crecs crecs){
		System.out.println("crecs 값은?:"+companyDao.addJob(crecs));
		return companyDao.addJob(crecs);
	}
	public Cpjts getProjectView(int cpjno) throws Exception {
		return companyDao.getProjectView(cpjno);
	}
	public Crecs getJob(int reno) throws Exception {
		return companyDao.getJob(reno);
	}
	
	public void addCompany(Cinfos cinfos){
		companyDao.addCompany(cinfos);
	}
	@Override
	public void addProjectSkills(Cpjts cpjts) {
		companyDao.addProjectSkills(cpjts);
	}
	@Override
	public List<Users> getJoinProjectUserList(Map<String, Object> map) {
		return companyDao.getJoinProjectUserList(map);
	}
}
