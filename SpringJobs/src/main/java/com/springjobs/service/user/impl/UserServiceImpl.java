package com.springjobs.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.dao.user.UserDao;
import com.springjobs.domain.UPhotos;
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
}
