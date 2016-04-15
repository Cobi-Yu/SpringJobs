package com.springjobs.service.user;

import com.springjobs.domain.User;

public interface UserService {
	public void addUser(User user);
	
	public int login(User user);
	
	public int idDuplicateCheck(User user);
}
