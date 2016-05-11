package com.springjobs.ajaxController;

import java.io.File;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


@Controller
public class TestController {
	@RequestMapping( value="/fileupload", method=RequestMethod.POST)
	public void getJsonUser1( MultipartHttpServletRequest request, Model model) throws Exception{
		Map<String, MultipartFile>	files = request.getFileMap();
		CommonsMultipartFile cmf = (CommonsMultipartFile) files.get("uploadFile");
		String path = request.getSession().getServletContext().getRealPath("/view/resources/img")+"/"+cmf.getOriginalFilename();
		File file = new File(path);
		cmf.transferTo(file);
	}
}
