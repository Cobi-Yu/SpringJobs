package com.springjobs.ajaxController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springjobs.domain.Cpjts;
import com.springjobs.service.company.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	@Qualifier("companyServiceImpl")
	private CompanyService companyService;
	
	@RequestMapping( value="/addProject" , method=RequestMethod.POST)
	public void addProject(@RequestBody Cpjts cpjts){
		System.out.println("addProject Test :"+cpjts.getCpjchk());
		companyService.addProject(cpjts);
	}
}