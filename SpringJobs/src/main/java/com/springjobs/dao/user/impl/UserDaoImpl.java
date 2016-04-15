package com.springjobs.dao.user.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springjobs.dao.user.UserDao;
import com.springjobs.domain.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public void addUser(User user){
		sqlSession.insert("UserMapper.addUser", user);
	}

	@Override
	public int login(User user) {
		return sqlSession.selectOne("UserMapper.login", user);
	}

	@Override
	public int idDuplicateCheck(User user) {
		return sqlSession.selectOne("UserMapper.idDuplicateCheck",user);
	}
}
