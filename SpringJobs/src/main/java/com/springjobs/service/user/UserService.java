package com.springjobs.service.user;

import java.util.List;
import java.util.Map;

import com.springjobs.domain.Skills;
import com.springjobs.domain.UPhotos;
import com.springjobs.domain.Unotify;
import com.springjobs.domain.Upfurl;
import com.springjobs.domain.Users;

public interface UserService {
	public Users addUser(Users user);
	
	public Users login(Users user);
	
	public int idDuplicateCheck(Users user);
	
	public int userEmailConfirm(int uno);
	
	public int uploadPhoto(UPhotos uPhotos);
	
	public UPhotos getUserPhoto(Users user);
	
	public List<Skills> getUserSkills(Users user);
	
	public int updateUserSkills(Users user);
	
	public int deleteUserSkills(Users user);
	
	public Map getTotalCount();
	
	public int insertUserPfUrl(Upfurl upfurl);

	public List<Upfurl> getUserPfUrlList(Upfurl upfurl);
	
	public int deleteUserPfUrl(Upfurl upfurl);
	
	public List<Users> getDeveloperList(List<Integer> sknoList);
	
	public Users getUserInfo(int uno);
	
	public List<Unotify> getNotifyList(Users user);
}
