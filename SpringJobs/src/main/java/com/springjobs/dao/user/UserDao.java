package com.springjobs.dao.user;

import com.springjobs.domain.Users;

public interface UserDao {
	public Users addUser(Users user);
	
	public Users login(Users user);
	
	public int idDuplicateCheck(Users user);
	
	public int userEmailConfirm(int uno);
}
