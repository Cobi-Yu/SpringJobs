package com.springjobs.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springjobs.dao.user.UserDao;
import com.springjobs.domain.User;
import com.springjobs.service.user.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Autowired
	@Qualifier("userDaoImpl")
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User user){
		userDao.addUser(user);
	}

	@Override
	public int login(User user) {
		return userDao.login(user);
	}

	@Override
	public int idDuplicateCheck(User user) {
		return userDao.idDuplicateCheck(user);
	}
}
