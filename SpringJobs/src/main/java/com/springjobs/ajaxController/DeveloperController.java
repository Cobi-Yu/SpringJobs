package com.springjobs.ajaxController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springjobs.common.Search;
import com.springjobs.domain.Users;
import com.springjobs.service.developer.DeveloperService;

@Controller
@RequestMapping("/developer")
public class DeveloperController {
	@Autowired
	@Qualifier("developerServiceImpl")
	private DeveloperService developerService;
	
	@RequestMapping( value="/projectList", method=RequestMethod.POST)
	public void getProjectList(@RequestBody Search search, Model model){
		System.out.println("test : "+search);
		model.addAttribute("cpjt", developerService.getProjectList(search));
	}
	
	@RequestMapping( value="/addInfo", method=RequestMethod.POST)
	public void addInfo(@RequestBody Users users, Model model){
		System.out.println("DeveloperController에서 users : "+users);
		model.addAttribute("users", developerService.addInfo(users));
	}
}
