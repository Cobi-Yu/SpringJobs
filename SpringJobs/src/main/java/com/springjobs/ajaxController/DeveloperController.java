package com.springjobs.ajaxController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springjobs.common.Search;

@Controller
@RequestMapping("/developer")
public class DeveloperController {
	@RequestMapping( value="/projectList", method=RequestMethod.POST)
	public void getProjectList(@RequestBody Search search, Model model){
		System.out.println("test : "+search);
		model.addAttribute("search", search);
	}
}
