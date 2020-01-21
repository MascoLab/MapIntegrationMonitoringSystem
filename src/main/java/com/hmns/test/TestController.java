package com.hmns.test;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hmns.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping( "/test/main.view" )
	public String main( Model model ) {
		return "/pages/main";
	}
	
	@RequestMapping( "/test/mainTest.view" )
	public ModelAndView mainTest( Model model ) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName( "/pages/main" );
		return mv;
	}
	
	@RequestMapping( "/test/mainTestList.view" )
	public ModelAndView mainTestList( Model model ) {
		ModelAndView mv = new ModelAndView();
		mv.addObject( "RESULT", testService.selectCommonCodeList( new HashMap<>() ) );
		return mv;
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/test/getCommonCodeList.do" )
	@ResponseBody
	public List<HashMap> getCommonCodeList( Model model ) {
		return testService.selectCommonCodeList( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/test/getServerResourceList.do" )
	@ResponseBody
	public List<HashMap> getServerResourceList( Model model ) {
		return testService.selectServerResourceList( new HashMap<>() );
	}
}
