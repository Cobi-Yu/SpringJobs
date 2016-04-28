package com.springjobs.service.developer.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.common.Search;
import com.springjobs.dao.developer.DeveloperDao;
import com.springjobs.domain.Cpjts;
import com.springjobs.service.developer.DeveloperService;

@Service("developerServiceImpl")
public class DeveloperServiceImpl implements DeveloperService {
	
	@Autowired
	@Qualifier("developerDaoImpl")
	private DeveloperDao developerDao;
	
	@Override
	public List<Cpjts> getProjectList(Search search) {
		return developerDao.getProjectList(search);
	}
}
