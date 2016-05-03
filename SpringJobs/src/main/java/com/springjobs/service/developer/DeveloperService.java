package com.springjobs.service.developer;

import java.util.List;

import com.springjobs.common.Search;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.UTags;
import com.springjobs.domain.Users;

public interface DeveloperService {
	public List<Cpjts> getProjectList(Search search);
	
	public int addInfo(Users users);
	
	public List<UTags> uTags(Search search);
	
	public List<String> getUtag(int uno) throws Exception;
}
