package com.springjobs.service.developer.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.common.Search;
import com.springjobs.dao.developer.DeveloperDao;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Uscls;
import com.springjobs.domain.Users;
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
	@Override
	public int addInfo(Users users){
		return developerDao.addInfo(users);
	}
	@Override
	public int addTags(Map<String, Object> tagMap) {
		return developerDao.addTags(tagMap);
	}

	@Override
	public List<String> getUtag(int uno) throws Exception {
		return developerDao.getUtag(uno);
	}
	@Override
	public void deleteUtags(Users user) {
		developerDao.deleteUtags(user);
	}
	@Override
	public int addAcademic(Uscls uscls){
		return developerDao.addAcademic(uscls);
	}
	
}
