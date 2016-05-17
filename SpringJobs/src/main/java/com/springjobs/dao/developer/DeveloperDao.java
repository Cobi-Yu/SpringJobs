package com.springjobs.dao.developer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springjobs.common.Search;
import com.springjobs.domain.Cpjjoin;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Ucerts;
import com.springjobs.domain.Uexps;
import com.springjobs.domain.Ulans;
import com.springjobs.domain.Uscls;
import com.springjobs.domain.Users;

public interface DeveloperDao {
	public List<Cpjts> getProjectList(Search search);
	
	public List<Cpjts> myProjectList(HashMap map);
	
	public List<Cpjts> myPutProjectList(HashMap map);
	
	public int addInfo(Users users);
	
/*	public int addAcademic(Uscls uscls);*/
	
	public int addTags(Map<String, Object> tagMap);
	
	public List<String> getUtag(int uno) throws Exception;
	
	public int joinProject(Map<String, Object> map);
	
	public List<Users> getJoinProjectList(Map<String,Object> map);
	
	public void deleteUtags(Users user);
	
	public Uexps getUexps(int uno) throws Exception;
	
	public void addUexps(Uexps uexps);
	
	public void addUscls(Uscls uscls);
	
	public Ulans getUlans(int uno) throws Exception;
	
	public Ucerts getUcerts(int uno) throws Exception;
	
	public Uscls getUscls(int uno) throws Exception;

	public Cpjjoin getJoinInfo(Map<String, Object> map);
	
	public Users getJoinProjectUser(Map<String, Object> map);

	public void addUlans(Ulans ulans);
	
	public void addUcerts(Ucerts ucerts);
	
	public void updateUres(Users users);
}
