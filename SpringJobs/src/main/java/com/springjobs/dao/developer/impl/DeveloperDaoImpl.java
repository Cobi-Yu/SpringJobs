package com.springjobs.dao.developer.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.springjobs.common.Search;
import com.springjobs.dao.developer.DeveloperDao;
import com.springjobs.domain.Users;
import com.springjobs.domain.Cpjts;

@Repository("developerDaoImpl")
public class DeveloperDaoImpl implements DeveloperDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Cpjts> getProjectList(Search search) {
		return sqlSession.selectList("ProjectMapper.getProjectList", search);
	}
	
	public int addInfo(Users users){
		sqlSession.insert("UserMapper.addInfo", users);
		int uno = users.getUno();
		System.out.println("dao impl에서 uno 값은??"+ uno);
		return uno;
	}
}
