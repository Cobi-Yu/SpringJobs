package com.springjobs.dao.user.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springjobs.dao.user.UserDao;
import com.springjobs.domain.UPhotos;
import com.springjobs.domain.Users;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public Users addUser(Users user){
		sqlSession.insert("UserMapper.addUser", user);
		return user;
	}

	@Override
	public Users login(Users user) {
		return sqlSession.selectOne("UserMapper.login", user);
	}

	@Override
	public int idDuplicateCheck(Users user) {
		return sqlSession.selectOne("UserMapper.idDuplicateCheck",user);
	}

	@Override
	public int userEmailConfirm(int uno) {
		return sqlSession.update("UserMapper.userEmailConfirm",uno);
	}

	@Override
	public int uploadPhoto(UPhotos uPhotos) {
		return sqlSession.insert("UserMapper.uploadPhoto",uPhotos);
	}

	@Override
	public UPhotos getUserPhoto(Users user) {
		return sqlSession.selectOne("UserMapper.getUserPhoto",user);
	}
}
