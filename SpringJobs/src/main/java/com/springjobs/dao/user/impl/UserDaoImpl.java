package com.springjobs.dao.user.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springjobs.dao.user.UserDao;
import com.springjobs.domain.Skills;
import com.springjobs.domain.UPhotos;
import com.springjobs.domain.Upfurl;
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

	@Override
	public List<Skills> getUserSkills(Users user) {
		return sqlSession.selectList("UserMapper.getUserSkills",user);
	}

	@Override
	public int updateUserSkills(Users user) {
		return sqlSession.insert("UserMapper.updateUserSkills",user);
	}

	@Override
	public int deleteUserSkills(Users user) {
		return sqlSession.insert("UserMapper.deleteUserSkills",user);
	}

	@Override
	public Map getTotalCount() {
		System.out.println("UserDaoImpl에서 getTotalCount :"+(Map)sqlSession.selectOne("MainMapper.getTotalCount"));
		return (Map)sqlSession.selectOne("MainMapper.getTotalCount");
	}

	@Override
	public int insertUserPfUrl(Upfurl upfurl) {
		sqlSession.insert("UserMapper.insertUserPfUrl",upfurl);
		return upfurl.getUpfurlno();
	}

	@Override
	public List<Upfurl> getUserPfUrlList(Upfurl upfurl) {
		return sqlSession.selectList("UserMapper.getUserPfUrlList",upfurl);
	}

	@Override
	public int deleteUserPfUrl(Upfurl upfurl) {
		return sqlSession.delete("UserMapper.deleteUserPfUrl",upfurl);
	}

	@Override
	public List<Users> getDeveloperList(Map<String,Object> map) {
		return sqlSession.selectList("UserMapper.getDeveloperList",map);
	}

	@Override
	public Users getUserInfo(int uno) {
		System.out.println("UserDaoImpl에서 USER :"+sqlSession.selectOne("UserMapper.getUserInfo", uno));
		return sqlSession.selectOne("UserMapper.getUserInfo", uno);
	}
	
}
