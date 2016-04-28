package com.springjobs.dao.developer;

import java.util.List;

import com.springjobs.common.Search;
import com.springjobs.domain.Cpjts;

public interface DeveloperDao {
	public List<Cpjts> getProjectList(Search search);
}
