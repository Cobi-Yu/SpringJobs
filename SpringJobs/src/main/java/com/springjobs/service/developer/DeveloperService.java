package com.springjobs.service.developer;

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

public interface DeveloperService {
	public List<Cpjts> getProjectList(Search search);
	
	public int addInfo(Users users);
	
	public int addTags(Map<String, Object> map);
	
	public List<String> getUtag(int uno) throws Exception;
	
	public int joinProject(Map<String, Object> map);
	
	public Cpjjoin getJoinInfo(Map<String, Object> map);
	
	public List<Users> getJoinProjectList(Map<String,Object> map);
	
	public void deleteUtags(Users user); 
	
	// 경력
	public Uexps getUexps(int uno) throws Exception;

	public void addUexps(Uexps uexps);
	
	// 외국어
	public Ulans getUlans(int uno) throws Exception;

	// 자격증
	public Ucerts getUcerts(int uno) throws Exception;
	
	public Uscls getUscls(int uno) throws Exception;
	
	public void addUlans(Ulans ulans);
	
	public void addUcerts(Ucerts ucerts);
	
	public void addUscls(Uscls uscls);
	
	public Users getJoinProjectUser (Map<String,Object> map);
	

	public void updateUres(Users users);
}
