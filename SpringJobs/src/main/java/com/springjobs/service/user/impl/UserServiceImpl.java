package com.springjobs.service.user.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.dao.user.UserDao;
import com.springjobs.domain.Skills;
import com.springjobs.domain.UPhotos;
import com.springjobs.domain.Upfurl;
import com.springjobs.domain.Users;
import com.springjobs.service.user.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Autowired
	@Qualifier("userDaoImpl")
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public Users addUser(Users user){
		return userDao.addUser(user);
	}

	@Override
	public Users login(Users user) {
		return userDao.login(user);
	}

	@Override
	public int idDuplicateCheck(Users user) {
		return userDao.idDuplicateCheck(user);
	}

	@Override
	public int userEmailConfirm(int uno) {
		return userDao.userEmailConfirm(uno);
	}

	@Override
	public int uploadPhoto(UPhotos uPhotos) {
		return userDao.uploadPhoto(uPhotos);
	}

	@Override
	public UPhotos getUserPhoto(Users user) {
		return userDao.getUserPhoto(user);
	}

	@Override
	public List<Skills> getUserSkills(Users user) {
		return userDao.getUserSkills(user);
	}

	@Override
	public int updateUserSkills(Users user) {
		return userDao.updateUserSkills(user);
	}

	@Override
	public int deleteUserSkills(Users user) {
		return userDao.deleteUserSkills(user);
	}

	@Override
	public Map getTotalCount() {
		return userDao.getTotalCount();
	}
	
	@Override
	public int insertUserPfUrl(Upfurl upfurl) {
		return userDao.insertUserPfUrl(upfurl);
	}

	@Override
	public List<Upfurl> getUserPfUrlList(Upfurl upfurl) {
		return userDao.getUserPfUrlList(upfurl);
	}

	@Override
	public int deleteUserPfUrl(Upfurl upfurl) {
		return userDao.deleteUserPfUrl(upfurl);
	}

	@Override
	public List<Users> getDeveloperList(List<Integer> sknoList) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("size", sknoList.size());
		map.put("list", sknoList);
		return userDao.getDeveloperList(map);
	}

	@Override
	public Users getUserInfo(int uno) {
		return userDao.getUserInfo(uno);
	}
	
}
