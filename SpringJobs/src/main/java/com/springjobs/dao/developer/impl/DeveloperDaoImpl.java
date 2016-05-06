package com.springjobs.dao.developer.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springjobs.common.Search;
import com.springjobs.dao.developer.DeveloperDao;
import com.springjobs.domain.Cpjts;
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
	public int addInfo(Users users){
		sqlSession.insert("UserMapper.addInfo", users);
		int uno = users.getUno();
		System.out.println("dao impl에서 uno 값은??"+ uno);
		return uno;
	}
	
	@Override
	public int addAcademic(Uscls uscls){
		sqlSession.update("UserMapper.addAcademic", uscls);
		int scno = uscls.getScno();
		int uno = uscls.getUno();
		System.out.println("dao impl에서 uno 값은??"+ uno);
		System.out.println("dao impl에서 scno 값은??"+ scno);
		return uno + scno;
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
	public int joinProject(Map<String, Integer> map) {
		return sqlSession.insert("ProjectMapper.joinProject", map);
	}

	@Override
	public List<Users> getJoinProjectList(Map<String, Integer> map) {
		return sqlSession.selectList("ProjectMapper.getJoinProjectList",map);
	}

	@Override
	public void deleteUtags(Users user) {
		System.out.println("DeveloperDaoImpl에서 uno : "+user.getUno());
		sqlSession.delete("UserMapper.removeTags", user);
	}
	
	
}
