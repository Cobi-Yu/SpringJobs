package com.springjobs.ajaxController;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springjobs.domain.Cinfos;
import com.springjobs.domain.Cpjts;
import com.springjobs.domain.Crecs;
import com.springjobs.service.company.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	@Qualifier("companyServiceImpl")
	private CompanyService companyService;
	
	@RequestMapping( value="/addProject" , method=RequestMethod.POST)
	public void addProject(@RequestBody Cpjts cpjts, Model model){
		System.out.println("addProject Test :"+cpjts.toString());
		cpjts.setCpjno(companyService.addProject(cpjts));
		companyService.addProjectSkills(cpjts);
		model.addAttribute("cpjno",cpjts.getCpjno());
	}
	
	@RequestMapping( value="/getComp", method=RequestMethod.GET)
	public void getComp(@RequestParam("uno") int uno, Model model) throws Exception{
		System.out.println("companyController에서 getComp :"+companyService.getComp(uno));
		System.out.println("companyController에서  uno :"+uno);
		model.addAttribute("cinfos", companyService.getComp(uno));
	}
	@RequestMapping( value="/addComp", method=RequestMethod.POST)
	public void addComp(@RequestBody Cinfos cinfos, Model model){
		System.out.println(cinfos);
		companyService.addComp(cinfos);
	}
	
	
	@RequestMapping( value="/getProjectView" , method=RequestMethod.GET)
	public void getProjectView(@RequestParam("cpjno") int cpjno, Model model) throws Exception{
		System.out.println("getProjectView Test :"+cpjno);
		model.addAttribute("cpjt", companyService.getProjectView(cpjno));
	}
	
	@RequestMapping( value="/addJob" , method=RequestMethod.POST)
	public void addJob(@RequestBody Crecs crecs, Model model){
		System.out.println("addJob Test :"+crecs.toString());
		model.addAttribute("reno",companyService.addJob(crecs));
	}
	
	@RequestMapping( value="/getJob", method=RequestMethod.GET )
	public void getJob( @RequestParam("reno") int reno , Model model ) throws Exception {		
		System.out.println("/getJob/getJob : GET");
		Crecs crecs = companyService.getJob(reno);
		model.addAttribute("crecs", crecs);
	}
	
	@RequestMapping( value="/getJoinProjectUserList" , method=RequestMethod.POST)
	public void getJoinProjectUserList(@RequestBody HashMap<String, Object> map, Model model) throws Exception{
		model.addAttribute("userList", companyService.getJoinProjectUserList(map));
	}
	
	@RequestMapping( value="/confirmProjectUser" , method=RequestMethod.POST)
	public void confirmProjectUser(@RequestBody HashMap<String, Integer> map, Model model){
		model.addAttribute("confirmResult", companyService.confirmProjectUser(map));
	}
}