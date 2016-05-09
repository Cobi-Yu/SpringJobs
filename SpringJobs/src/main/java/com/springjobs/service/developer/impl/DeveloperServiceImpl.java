package com.springjobs.service.developer.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.common.Search;
import com.springjobs.dao.developer.DeveloperDao;
import com.springjobs.domain.Cpjjoin;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Ucerts;
import com.springjobs.domain.Uexps;
import com.springjobs.domain.Ulans;
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
/*	@Override
	public int addAcademic(Uscls uscls){
		return developerDao.addAcademic(uscls);
	}*/
	@Override
	public int joinProject(Map<String, Integer> map) {
		return developerDao.joinProject(map);
	}
	@Override
	public List<Users> getJoinProjectList(Map<String, Integer> map) {
		return developerDao.getJoinProjectList(map);
	}
	@Override
	public Uexps getUexps(int uno) throws Exception {
		return developerDao.getUexps(uno);
	}
	@Override
	public void addUexps(Uexps uexps) {
		developerDao.addUexps(uexps);
	}
	@Override
	public Ulans getUlans(int uno) throws Exception {
		return developerDao.getUlans(uno);
	}
	@Override
	public Ucerts getUcerts(int uno) throws Exception {
		return developerDao.getUcerts(uno);
	}
	@Override
	public Uscls getUscls(int uno) throws Exception {
		return developerDao.getUscls(uno);
	}
}
