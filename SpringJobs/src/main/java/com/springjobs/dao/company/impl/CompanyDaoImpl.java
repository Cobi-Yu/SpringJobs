package com.springjobs.dao.company.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springjobs.dao.company.CompanyDao;
import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;
import com.springjobs.domain.Users;

@Repository("companyDaoImpl")
public class CompanyDaoImpl implements CompanyDao{
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int addProject(Cpjts cpjts){
		sqlSession.insert("ProjectMapper.addProject", cpjts);
		int cpjno = cpjts.getCpjno();
		return cpjno;
	}
	
	public Cpjts getProjectView(int cpjno) throws Exception{
		return sqlSession.selectOne("ProjectMapper.getProject", cpjno);	
	}
	
	public int addJob(Crecs crecs){
		sqlSession.insert("AddJobMapper.addJob", crecs);
		int reno = crecs.getReno();
		return reno;
	}
	
	public Crecs getJob(int reno) throws Exception {
		return sqlSession.selectOne("AddJobMapper.getJob", reno);
	}
	
	public void addCompany(Cinfos cinfos){
		sqlSession.insert("AddCompanyMapper.addCompany", cinfos);
	}

	@Override
	public void addProjectSkills(Cpjts cpjts) {
		sqlSession.insert("ProjectMapper.addProjectSkills",cpjts);
	}

	@Override
	public List<Users> getJoinProjectUserList(Map<String, Object> map) {
		return sqlSession.selectList("ProjectMapper.getJoinProjectUserList", map);
	}
}
