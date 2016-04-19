package com.springjobs.dao.user;

import com.springjobs.domain.Users;

public interface UserDao {
	public void addUser(Users user);
	
	public Users login(Users user);
	
	public int idDuplicateCheck(Users user);
}
