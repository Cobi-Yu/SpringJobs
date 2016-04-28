package com.springjobs.ajaxController;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springjobs.domain.Users;
import com.springjobs.service.user.UserService;

@Controller
public class UserController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@RequestMapping( value="/user1", method=RequestMethod.POST)
	public void getJsonUser1(	@RequestBody Users user, 
									 			Model model) throws Exception{
		System.out.println("/getJsonUser2 : POST value : "+user);
		model.addAttribute("user", user);
	}
	
	@RequestMapping( value="/user2", method=RequestMethod.GET)
	public void getJsonUser2(	@RequestParam("userId") String userId, 
			Model model) throws Exception{
		System.out.println("/getJsonUser2 : GET value : "+userId);
		model.addAttribute("user", null);
	}
	
	@RequestMapping( value="/addUser", method=RequestMethod.POST)
	public void addUser(@RequestBody Users user){
		System.out.println("addUser called"+user.getUem());
		userService.addUser(user);
	}
	
	@RequestMapping( value="/login", method=RequestMethod.POST)
	public void login(@RequestBody Users user, HttpSession session, Model model){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Login Request executed: "+user.getUem());
		Users loginUser = userService.login(user);
		session.setAttribute("user", loginUser);
		System.out.println("SESSION : "+session.getAttribute("user"));
		model.addAttribute("user", loginUser);
	}

	@RequestMapping( value="/loginCheck", method=RequestMethod.POST)
	public void loginCheck(HttpSession session, Model model){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users loginUser = (Users) session.getAttribute("user");
		model.addAttribute("user", loginUser);
	}
	
	@RequestMapping( value="/logout", method=RequestMethod.POST)
	public void logout(HttpSession session, Model model){
		session.invalidate();
	}
	
}
