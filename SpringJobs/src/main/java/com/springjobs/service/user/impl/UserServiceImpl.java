package com.springjobs.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.dao.user.UserDao;
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
	
	public void addUser(Users user){
		userDao.addUser(user);
	}

	@Override
	public int login(Users user) {
		return userDao.login(user);
	}

	@Override
	public int idDuplicateCheck(Users user) {
		return userDao.idDuplicateCheck(user);
	}
}
