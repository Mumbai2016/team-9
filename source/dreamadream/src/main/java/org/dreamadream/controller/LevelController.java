package org.dreamadream.controller;

import org.dreamadream.service.impl.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


public class LevelController {
	

	@Autowired
	private LevelService levelService;
	
	
	@RequestMapping(value = "/get-levels", method = RequestMethod.GET)
	public @ResponseBody String getLevels(){
	
		System.out.println(levelService.getLevel("102"));
		
		
		return "";
	}
	
}
