package com.hmns.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.hmns.test.service.TestService;
import com.hmns.utils.CommonUtils;

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
		mv.setViewName( "/product" ); ///pages/main
		return mv;
	}
	
	@RequestMapping( "/test/mainTestList.view" )
	public ModelAndView mainTestList( Model model ) {
		ModelAndView mv = new ModelAndView( new MappingJackson2JsonView() );
		mv.addObject( "RESULT", testService.selectCommonCodeList( new HashMap<>() ) );
		return mv;
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/test/insertTestList.do" )
	public ModelAndView insertTestList( HttpServletRequest request ) throws Exception {
		ModelAndView mv = new ModelAndView( new MappingJackson2JsonView() );
		
		Map paramMap = CommonUtils.getNoEmptyParamMap( request );
		System.out.println( "##### PARAMETER : " + paramMap.toString() );
		
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
