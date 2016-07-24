package org.dreamadream.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		r1.setLevel("LSD");
		r1.setLevelDateOfJoining("02-04-2015");
		r1.setLevelEndDate("23-05-2016");
		r1.setNgoComments("AVERAGE");
		r1.setUserId("102");
		
		Level r2 = new Level();
		r2.setLevel("LSD");
		r2.setLevelDateOfJoining("23-03-2015");
		r2.setLevelEndDate("05-12-2016");
		r2.setNgoComments("EXCELLENT");
		r2.setUserId("102");
		
		
		Level r3 = new Level();
		r3.setLevel("LSD");
		r3.setLevelDateOfJoining("03-10-2015");
		r3.setLevelEndDate("23-3-2016");
		r3.setNgoComments("AVERAGE");
		r3.setUserId("102");
		
		
		Level r4 = new Level();
		r4.setLevel("CA");
		r4.setLevelDateOfJoining("08-03-2015");
		r4.setLevelEndDate("14-10-2016");
		r4.setNgoComments("GOOD");
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
	

	@RequestMapping(value = "/get-charts-test", method = RequestMethod.GET)		
	public @ResponseBody String getCharts(){
	
		//System.out.println(levelService.getLevel("102"));
		
		
		List<String> chart1 = new ArrayList<String>();
		List<String> chart2 = new ArrayList<String>();
		List<String> chart3 = new ArrayList<String>();
		List<String> chart4 = new ArrayList<String>();
		List<String> chart5 = new ArrayList<String>();
		
		chart1.add("2012-2013");
		chart1.add("70");
		chart1.add("2013-2014");
		chart1.add("682");
		chart1.add("2014-2015");
		chart1.add("201");
		chart1.add("2015-2016");
		chart1.add("1230");		
		
		chart2.add("12-13");
		chart1.add("230");	
		chart2.add("14-15");
		chart1.add("230");	
		chart2.add("15-16");
		chart1.add("130");	
		chart2.add("16-17");
		chart1.add("120");	
		chart2.add("Above 18");
		chart1.add("290");	
		
		
		chart3.add("Number of drop outs in the first quarter");
		chart3.add("23");
		chart3.add("Number of young people meaningfully engaged since last quarter");
		chart3.add("13");
		chart3.add("Number of young people receiving LMS program among drop outs");
		chart3.add("19");
		chart3.add("No of young people who continue to be drop outs even in this quarter");
		chart3.add("43");
		chart3.add("Number of unique new drop outs added in this quarter");
		chart3.add("10");
	
		
		chart4.add("20");
		chart4.add("24");
		chart4.add("32");
		chart4.add("21");
		chart4.add("34");
		
		chart4.add("45");
		chart4.add("23");
		chart4.add("14");
		chart4.add("45");
		chart4.add("30");
		
		chart4.add("25");
		chart4.add("29");
		chart4.add("34");
		chart4.add("44");
		chart4.add("32");
		
		
		chart4.add("42");
		chart4.add("23");
		chart4.add("14");
		chart4.add("41");
		chart4.add("39");
		
		
		Map<String,List<String>> result = new HashMap<String,List<String>>();
		result.put("c1", chart1);
		result.put("c2", chart2);
		result.put("c3", chart3);
		result.put("c4", chart4);
		
		//System.out.println(result.toString());
		//return new Gson().toJson(result);
		
		return new Gson().toJson(result);
		
	}
	
	@RequestMapping(value = "/get-chart1", method = RequestMethod.GET)
	public void getChart1(){
	
		//System.out.println(levelService.getLevel("102"));
		
		
		List<String> chart1 = new ArrayList<String>();
		List<String> chart2 = new ArrayList<String>();
		List<String> chart3 = new ArrayList<String>();
		List<String> chart4 = new ArrayList<String>();
		List<String> chart5 = new ArrayList<String>();
		
		chart1.add("2012-2013");
		chart1.add("70");
		chart1.add("2013-2014");
		chart1.add("682");
		chart1.add("2014-2015");
		chart1.add("201");
		chart1.add("2015-2016");
		chart1.add("1230");		
		
		chart2.add("12-13");
		chart2.add("230");	
		chart2.add("14-15");
		chart2.add("230");	
		chart2.add("15-16");
		chart2.add("130");	
		chart2.add("16-17");
		chart2.add("120");	
		chart2.add("Above 18");
		chart2.add("290");	
		
		
		chart3.add("Number of drop outs in the first quarter");
		chart3.add("23");
		chart3.add("Number of young people meaningfully engaged since last quarter");
		chart3.add("13");
		chart3.add("Number of young people receiving LMS program among drop outs");
		chart3.add("19");
		chart3.add("No of young people who continue to be drop outs even in this quarter");
		chart3.add("43");
		chart3.add("Number of unique new drop outs added in this quarter");
		chart3.add("10");
	
		
		chart4.add("");
		chart4.add("");
		chart4.add("");
		chart4.add("");
		chart4.add("");
		
		chart4.add("");
		chart4.add("");
		chart4.add("");
		chart4.add("");
		chart4.add("");
		
		/*
		
		System.out.println(result.toString());
		return new Gson().toJson(result);
		*/
		
		return ;
	}
	*/
		
		
	
}
