package com.springjobs.dao.company.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springjobs.dao.company.CompanyDao;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;

@Repository("companyDaoImpl")
public class CompanyDaoImpl implements CompanyDao{
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public void addProject(Cpjts cpjts){
		sqlSession.insert("ProjectMapper.addProject", cpjts);
	}
	
	public void addJob(Crecs crecs){
		sqlSession.insert("AddJobMapper.addJob", crecs);
	}
	
	public Crecs getJob(int reno) throws Exception {
		return sqlSession.selectOne("AddJobMapper.getJob", reno);
	}
	
}
