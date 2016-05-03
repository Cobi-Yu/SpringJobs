package com.springjobs.ajaxController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping( value="/getUtag", method=RequestMethod.GET)
	public void getUtag(@RequestParam("uno") int uno, Model model) throws Exception{
		System.out.println("developerController에서 getUtag :"+developerService.getUtag(uno));
		System.out.println("DeveloperContoller에서 uno:"+uno);
		model.addAttribute("utags", developerService.getUtag(uno));
	
	}
	
	@RequestMapping(value="/uTags", method=RequestMethod.POST)
	public void uTags(@RequestBody List<String> uextg, Model model){			
		System.out.println("!@!#!#@!#???");
		System.out.println("uextg : "+uextg.toString());
		for (String string : uextg) {
			System.out.println(string);
		}
//		model.addAttribute("utags", developerService.uTags(search));
	}
}