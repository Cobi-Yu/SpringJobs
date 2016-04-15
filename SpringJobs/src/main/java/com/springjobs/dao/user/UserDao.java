package com.springjobs.dao.user;

import com.springjobs.domain.User;

public interface UserDao {
	public void addUser(User user);
	
	public int login(User user);
	
	public int idDuplicateCheck(User user);
}
