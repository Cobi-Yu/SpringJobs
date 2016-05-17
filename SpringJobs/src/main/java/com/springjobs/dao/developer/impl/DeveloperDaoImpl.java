package com.springjobs.dao.developer.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springjobs.common.Search;
import com.springjobs.dao.developer.DeveloperDao;
import com.springjobs.domain.Cpjjoin;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Ucerts;
import com.springjobs.domain.Uexps;
import com.springjobs.domain.Ulans;
import com.springjobs.domain.Uscls;
import com.springjobs.domain.Users;


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

	@Override
	public List<Cpjts> myProjectList(HashMap map) {
		System.out.println("developerdaoimpl에서 myProjectList :"+sqlSession.selectList("ProjectMapper.myProjectList", map.get("uno")));
		return sqlSession.selectList("ProjectMapper.myProjectList", map.get("uno"));
	}

	@Override
	public List<Cpjts> myPutProjectList(HashMap map) {
		System.out.println("developerdaoimpl에서 myPutProjectList :"+sqlSession.selectList("ProjectMapper.myPutProjectList", map.get("uno")));
		return sqlSession.selectList("ProjectMapper.myPutProjectList", map.get("uno"));
	}

	@Override
	public int addInfo(Users users){
		sqlSession.insert("UserMapper.addInfo", users);
		int uno = users.getUno();
		System.out.println("dao impl에서 uno 값은??"+ uno);
		return uno;
	}
	
	@Override
	public int addTags(Map<String, Object> tagMap){
		
		System.out.println("DeveloperDaoImpl에서 tagMap :"+tagMap);
		
		return sqlSession.insert("UserMapper.uTags", tagMap);
	}

	@Override
	public List<String> getUtag(int uno) throws Exception {
		return sqlSession.selectList("UserMapper.getUtag", uno);
	}

	@Override
	public int joinProject(Map<String, Object> map) {
		return sqlSession.insert("ProjectMapper.joinProject", map);
	}

	@Override
	public List<Users> getJoinProjectList(Map<String, Object> map) {
		return sqlSession.selectList("ProjectMapper.getJoinProjectList",map);
	}

	@Override
	public void deleteUtags(Users user) {
		System.out.println("DeveloperDaoImpl에서 uno : "+user.getUno());
		sqlSession.delete("UserMapper.removeTags", user);
	}

	@Override
	public Uexps getUexps(int uno) throws Exception {
		return sqlSession.selectOne("UserMapper.getUexps", uno);
	}

	@Override
	public void addUexps(Uexps uexps) {
		System.out.println("DeveloperDaoImpl에서 uexps : "+uexps);
		sqlSession.insert("UserMapper.addUexps", uexps);
	}

	@Override
	public void addUscls(Uscls uscls) {
		System.out.println("DeveloperDaoImpl에서 uscls : "+uscls);
		sqlSession.insert("UserMapper.addUscls", uscls);
	}
	@Override
	public Ulans getUlans(int uno) throws Exception {
		return sqlSession.selectOne("UserMapper.getUlans", uno);
	}

	@Override
	public Ucerts getUcerts(int uno) throws Exception {
		return sqlSession.selectOne("UserMapper.getUcerts", uno);
	}	
	
	@Override
	public Uscls getUscls(int uno) throws Exception {
		return sqlSession.selectOne("UserMapper.getUscls", uno);
	}

	@Override
	public Cpjjoin getJoinInfo(Map<String, Object> map) {
		return sqlSession.selectOne("ProjectMapper.getJoinInfo",map);
	}

	@Override
	public Users getJoinProjectUser(Map<String, Object> map) {
		return sqlSession.selectOne("ProjectMapper.getJoinProjectUser",map);
	}

	@Override
	public void addUlans(Ulans ulans) {
		sqlSession.insert("UserMapper.addUlans", ulans);
	}

	@Override
	public void addUcerts(Ucerts ucerts) {
		sqlSession.insert("UserMapper.addUcerts", ucerts);
	}

	@Override
	public void updateUres(Users users) {
		sqlSession.update("UserMapper.updateUres", users);
	}
}
