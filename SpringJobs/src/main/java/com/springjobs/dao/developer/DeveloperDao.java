package com.springjobs.dao.developer;

import java.util.List;

import com.springjobs.common.Search;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.UTags;
import com.springjobs.domain.Users;

public interface DeveloperDao {
	public List<Cpjts> getProjectList(Search search);
	
	public int addInfo(Users users);
	
	public List<UTags> uTags(Search search);
	
	public List<UTags> getUtag(int uno) throws Exception;
}
