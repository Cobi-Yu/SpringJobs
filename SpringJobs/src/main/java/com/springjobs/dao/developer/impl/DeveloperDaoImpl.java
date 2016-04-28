package com.springjobs.dao.developer.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springjobs.common.Search;
import com.springjobs.dao.developer.DeveloperDao;
import com.springjobs.domain.Cpjts;

@Repository("developerDaoImpl")
public class DeveloperDaoImpl implements DeveloperDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	@Override
	public List<Cpjts> getProjectList(Search search) {
		return sqlSession.selectList("ProjectMapper.getProjectList", search);
	}

}
