package org.dreamadream.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView indexjsp(HttpServletRequest request) {
		
		
			return new ModelAndView("index");
		
	}
	
}
