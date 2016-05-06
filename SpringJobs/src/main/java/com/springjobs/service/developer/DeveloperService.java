package com.springjobs.service.developer;

import java.util.List;
import java.util.Map;

import com.springjobs.common.Search;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Uexps;
import com.springjobs.domain.Uscls;
import com.springjobs.domain.Users;

public interface DeveloperService {
	public List<Cpjts> getProjectList(Search search);
	
	public int addInfo(Users users);
	
	public int addAcademic(Uscls uscls);
	
	public int addTags(Map<String, Object> map);
	
	public List<String> getUtag(int uno) throws Exception;
	
	public int joinProject(Map<String, Integer> map);
	
	public List<Users> getJoinProjectList(Map<String,Integer> map);
	
	public void deleteUtags(Users user); 
	
	public Uexps getUexps(int uno) throws Exception;
}
