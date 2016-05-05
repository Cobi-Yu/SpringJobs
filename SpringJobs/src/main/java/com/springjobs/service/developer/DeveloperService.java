package com.springjobs.service.developer;

import java.util.List;
import java.util.Map;

import com.springjobs.common.Search;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Users;

public interface DeveloperService {
	public List<Cpjts> getProjectList(Search search);
	
	public int addInfo(Users users);
	
	public int addTags(Map<String, Object> map);
	
	public List<String> getUtag(int uno) throws Exception;
	
	public void deleteUtags(Users user); 
}
