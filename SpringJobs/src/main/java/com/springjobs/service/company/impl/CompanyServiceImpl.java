package com.springjobs.service.company.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.dao.company.CompanyDao;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;
import com.springjobs.service.company.CompanyService;

@Service("companyServiceImpl")
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	@Qualifier("companyDaoImpl")
	
	private CompanyDao companyDao;
	
	public void addProject(Cpjts cpjts){
		companyDao.addProject(cpjts);
	}
	public void addJob(Crecs crecs){
		companyDao.addJob(crecs);
	}
}
