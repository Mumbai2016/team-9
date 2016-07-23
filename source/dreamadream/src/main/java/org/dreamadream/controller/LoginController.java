package org.dreamadream.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	/*
	 * 
	 * 
	 * MAPPING PAGES
	@RequestMapping(
			value = "/login", 
			method = RequestMethod.GET)
	public @ResponseBody String searchCombined(
			@RequestBody String data, HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		return "";
	}
	
	
	/*
	 * 
	 * 
	 * SELECT *
	@RequestMapping(
			value = "/students", 
			method = RequestMethod.GET)
	public @ResponseBody String searchCombined(
			@RequestBody String data, HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		return "";
	}
	
	*/
	
	
	/*
	 * 
	 * 
	 * SELECT * WHERE ID=""
	@RequestMapping(
			value = "/login", 
			method = RequestMethod.GET)
	public @ResponseBody String searchCombined(
			@RequestBody String data, HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		return "";
	}
	*/
	
	
	/*
	 * 
	 * 
	 * MAPPING PAGES
	@RequestMapping(
			value = "/login", 
			method = RequestMethod.GET)
	public @ResponseBody String searchCombined(
			@RequestBody String data, HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		return "";
	}
	*/
	
	@RequestMapping(
			value = "/login", 
			method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
			
		
			return new ModelAndView("login");
	}
	
	@RequestMapping(
			value = "/login-submit", 
			method = RequestMethod.POST)
	public ModelAndView loginSubmit(
			HttpServletRequest request, HttpServletResponse response,
			@RequestParam Map<String, String> r)  {
		
		ModelAndView view = null;
		
		if(r.get("username").equals("student")
				&& r.get("password").equals("123")){
			
			view = new ModelAndView("student");
		}
		else if(r.get("username").equals("student")
				&& r.get("password").equals("123")){
			view = new ModelAndView("admin");
		}
		
		return view;
	}
	
	
	
	
	
	

}
