package org.dreamadream.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.dreamadream.beans.UserDetailsBean;
import org.dreamadream.service.ProfileService;
import org.dreamadream.service.impl.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value = "/viewprofile", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request) {

		try {
			//String userId = (String) request.getSession(true).getAttribute("user_id");
			

			ModelAndView model = null;

			UserDetailsBean userDetailsBean = new UserDetailsBean();
			
			userDetailsBean.setUserId(1);
			
			System.out.println("before s3ervice");
			userDetailsBean = profileService.getProfile(userDetailsBean);

			System.out.println("after service");
			model = new ModelAndView("p1");
			
			model.addObject("u", userDetailsBean);
			
			System.out.println(userDetailsBean.getCentre());
			
			return model;
		}
		// }
		catch (Exception e) {
			//System.out.println(e);                       
			ModelAndView model = new ModelAndView("500");
			model.addObject("message", "Your session has timed out. Please login again");
			model.addObject("url", "form");

			return model;
		}
		
	}
	
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search() {

		try {
			//String userId = (String) request.getSession(true).getAttribute("user_id");
			

			ModelAndView model = null;

			
			
			model = new ModelAndView("index");
			
			return model;
		}
		// }
		catch (Exception e) {
			//System.out.println(e);                       
			ModelAndView model = new ModelAndView("500");
			model.addObject("message", "Your session has timed out. Please login again");
			model.addObject("url", "form");

			return model;
		}
		
	}

}
