package com.hmns.test;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmns.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping( "/test/main.view" )
	public String main( Model model ) {
//		model.addAllAttributes( "", )
//		model.addAttribute( "", "" );
		return "";
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/test/getCommonCodeList.do" )
	@ResponseBody
	public List<HashMap> getCommonCodeList( Model model ) {
		return testService.selectCommonCodeList( new HashMap<>() );
	}
/*
	@RequestMapping( "/test/test.do" )
	public ModelAndView getTestList( Map<String, Object> model ) {
		ModelAndView mv = new ModelAndView();
		mv.addObject( "RESULT", testService.selectCommonCodeList( new HashMap<>() ) );
		return mv;
	}
*/
}
