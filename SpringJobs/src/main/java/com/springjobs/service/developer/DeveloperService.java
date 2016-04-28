package com.springjobs.service.developer;

import com.springjobs.domain.Users;
import java.util.List;

import com.springjobs.common.Search;
import com.springjobs.domain.Cpjts;

public interface DeveloperService {
	public List<Cpjts> getProjectList(Search search);
	
	public int addInfo(Users users);
}
