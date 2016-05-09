package com.springjobs.ajaxController;


import java.util.HashMap;
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
	public void addTags(@RequestBody HashMap<String, Object> map, Model model){	
	
		System.out.println("DeveloperController HashMap :" + map);
		
		String suno = map.get("uno").toString();
		int uno = Integer.parseInt(suno);
		System.out.println("uno: "+uno);
		
		List<String> uextgs = (List<String>)map.get("uextg");
				
		Users user = new Users();
		user.setUno(uno);
		
		// 1. 기존에 있는 태그정보를 지운다.
		developerService.deleteUtags(user);
		
		// 2. 새로 넣은 정보를 집어넣는다.
		model.addAttribute("utags", developerService.addTags(map));
	}
	

	
	
	@RequestMapping(value="/joinProject", method=RequestMethod.POST)
	public void joinProject(@RequestBody HashMap<String, Integer> map, Model model){
		System.out.println("joinProject : "+map);
		if(developerService.getJoinProjectList(map).size()>=1){
			model.addAttribute("result",0);
		}else {
			model.addAttribute("result",developerService.joinProject(map));
		}
	}

	@RequestMapping(value="/getJoinProjectUser", method=RequestMethod.POST)
	public void getJoinProjectUser(@RequestBody HashMap<String, Integer> map, Model model){
		System.out.println("getJoinProjectUser : "+map);
		if(developerService.getJoinProjectList(map).size()>=1){
			model.addAttribute("result",0);
		}else{
			model.addAttribute("result",1);
		}
	}
	
	@RequestMapping( value="/getUexps", method=RequestMethod.GET)
	public void getUexps(@RequestParam("uno") int uno, Model model) throws Exception{
		System.out.println("developerController에서 getUexps :"+developerService.getUexps(uno));
		System.out.println("DeveloperContoller에서 uno:"+uno);
		model.addAttribute("uexps", developerService.getUexps(uno));
	}	
	
	@RequestMapping( value="/getUscls", method=RequestMethod.GET)
	public void getUscls(@RequestParam("uno") int uno, Model model) throws Exception{
		System.out.println("developerController에서 getUscls :"+developerService.getUscls(uno));
		System.out.println("DeveloperContoller에서 uno:"+uno);
		model.addAttribute("uscls", developerService.getUscls(uno));
	}	
}