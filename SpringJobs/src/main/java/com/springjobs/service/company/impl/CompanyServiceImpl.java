package com.springjobs.service.company.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.dao.company.CompanyDao;
import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;
import com.springjobs.service.company.CompanyService;

@Service("companyServiceImpl")
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	@Qualifier("companyDaoImpl")
	
	private CompanyDao companyDao;
	
	public int addProject(Cpjts cpjts){
		return companyDao.addProject(cpjts);
	}
	public void addJob(Crecs crecs){
		companyDao.addJob(crecs);
	}
	public Cpjts getProject(int cpjno) throws Exception {
		return companyDao.getProject(cpjno);
	}
	public Crecs getJob(int reno) throws Exception {
		return companyDao.getJob(reno);
	}
	
	public void addCompany(Cinfos cinfos){
		companyDao.addCompany(cinfos);
	}
}
