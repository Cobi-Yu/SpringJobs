package com.springjobs.ajaxController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		model.addAttribute("cpjno",companyService.addProject(cpjts));
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping( value="/addProjectView" , method=RequestMethod.GET)
	public void addProjectView(@RequestParam("cpjno") int cpjno, Model model) throws Exception{
		System.out.println("addProjectView Test :"+cpjno);
		Cpjts cpjts = companyService.getProject(cpjno);
		System.out.println("cotroller부분 cpjts :"+cpjts);
		model.addAttribute("cpjts", cpjts);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping( value="/addJob" , method=RequestMethod.POST)
	public void addJob(@RequestBody Crecs crecs){
		System.out.println("addJob Test :"+crecs.toString());
		companyService.addJob(crecs);
	}
	
	@RequestMapping( value="/getJob", method=RequestMethod.GET )
	public void getJob( @RequestParam("reno") int reno , Model model ) throws Exception {
		
		System.out.println("/getJob/getJob : POST");
		Crecs crecs = companyService.getJob(reno);
		model.addAttribute("crecs", crecs);
	
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*	@RequestMapping( value="/getJob/{reno}", method=RequestMethod.POST )
	public void getJob(	@PathVariable int reno, 
									 			Model model) throws Exception{
		
		System.out.println("/getJob/getJob : POST");
		Crecs crecs = companyService.getJob(reno);
		model.addAttribute("crecs", crecs);
	}*/
}