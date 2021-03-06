package com.capg.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capg.springmvc.dao.SpringMVCDao;
import com.capg.springmvc.dao.SpringMVCImpl;

@Controller
public class SpringmvcController {
	SpringMVCDao dao = new SpringMVCImpl();

	@RequestMapping(path="/getMessage",method=RequestMethod.GET)
	public ModelAndView getMessagePage() {
	
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/views/messagePage.jsp");
		return modelAndView;
	}
	@RequestMapping(path="/getMessage2",method=RequestMethod.GET)
	public String getMessagePage2() {
	
		return  "messagePage";
	}
	@RequestMapping(path="/getMessage3",method=RequestMethod.GET)
	public ModelAndView getMessagePage3(ModelAndView modelAndView) {
	
		modelAndView.setViewName("messagePage");
		return  modelAndView;
	}
	@RequestMapping(path="/getMessage4")
	
	public String getMessagePage3(HttpServletRequest request) {
		String msg = dao.getMessage();
		request.setAttribute("msg",msg);
		return "messagePage";
		
	}
@RequestMapping(path="/getMessage5")
	
	public String getMessagePage4(ModelMap modelMap) {
		String msg = dao.getMessage();
		modelMap.addAttribute("msg",msg);
		return "messagePage";
		
	}
@RequestMapping(path="/forward")

public String forwardReq() {
	
	return "forward:getMessage4";
	
}
@RequestMapping(path="/redirect")

public String redirectReq() {
	
	return "redirect:http://www.google.com";
	
}

	

}
