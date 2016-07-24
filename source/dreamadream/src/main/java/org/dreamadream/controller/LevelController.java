package org.dreamadream.controller;

import java.util.ArrayList;
import java.util.List;

import org.dreamadream.model.Level;
import org.dreamadream.service.impl.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class LevelController {
	

	@Autowired
	private LevelService levelService;
	
	
	@RequestMapping(value = "/get-levels", method = RequestMethod.GET)
	public @ResponseBody String getLevels(){
	
		System.out.println(levelService.getLevel("102"));
		
		
		return "";
	}
	

	@RequestMapping(value = "/get-levels-test", method = RequestMethod.GET
			,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getLevelsTest(){
	
		//System.out.println(levelService.getLevel("102"));
		
		
		List<Level> result = new ArrayList<Level>();
		
		Level r1 = new Level();
		r1.setLevel("CA");
		r1.setLevelDateOfJoining("03-03-2015");
		r1.setLevelEndDate("03-03-2016");
		r1.setNgoComments("EXCELLENT");
		r1.setUserId("102");
		
		Level r2 = new Level();
		r2.setLevel("CA");
		r2.setLevelDateOfJoining("03-03-2015");
		r2.setLevelEndDate("03-03-2016");
		r2.setNgoComments("EXCELLENT");
		r2.setUserId("102");
		
		
		Level r3 = new Level();
		r3.setLevel("CA");
		r3.setLevelDateOfJoining("03-03-2015");
		r3.setLevelEndDate("03-03-2016");
		r3.setNgoComments("EXCELLENT");
		r3.setUserId("102");
		
		
		Level r4 = new Level();
		r4.setLevel("CA");
		r4.setLevelDateOfJoining("03-03-2015");
		r4.setLevelEndDate("03-03-2016");
		r4.setNgoComments("EXCELLENT");
		r4.setUserId("102");
		
		result.add(r1);
		result.add(r2);
		result.add(r3);
		result.add(r4);
		
		System.out.println(result.toString());
		return new Gson().toJson(result);
		
		
	}
	
	/*@RequestMapping(value = "/graduate-enrolment", method = RequestMethod.GET
			,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getGraduateEnrolment(){
		
		
		List<Integer> less_than_3 = new ArrayList<Integer>();
		less_than_3.add(382);
		less_than_3.add(386);
		less_than_3.add(287);
		less_than_3.add(443);
		
		List<Integer> inactive = new ArrayList<Integer>();
		inactive.add(130);
		inactive.add(130);
		
		
		System.out.println(result.toString());
		return new Gson().toJson(result);
		
		
	}*/
	 
	/*
	for chart related api
	
	
	*/
	
/*	@RequestMapping(value = "/get-charts-test", method = RequestMethod.GET
			,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getChartTest(){
	
		//System.out.println(levelService.getLevel("102"));
		
		
		List<String> chart1 = new ArrayList<String>();
		List<String> chart2 = new ArrayList<String>();
		List<String> chart3 = new ArrayList<String>();
		List<String> chart4 = new ArrayList<String>();
		List<String> chart5 = new ArrayList<String>();
		
		chart1.add("2012");
		chart1.add("2013");
		chart1.add("2014");
		chart1.add("2015");
		chart1.add("2016");
		
		chart2.add("");
		chart2.add("");
		chart2.add("");
		chart2.add("");
		chart2.add("");
		
		
		chart3.add("");
		chart3.add("");
		chart3.add("");
		chart3.add("");
		chart3.add("");
		
		chart4.add("");
		chart4.add("");
		chart4.add("");
		chart4.add("");
		chart4.add("");
		
		chart5.add("");
		chart5.add("");
		chart5.add("");
		chart5.add("");
		chart5.add("");
		
		
		
		System.out.println(result.toString());
		return new Gson().toJson(result);
		
		
	}*/
	
}
