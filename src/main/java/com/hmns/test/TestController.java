package com.hmns.test;

import java.util.ArrayList;
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
		return "/pages/test";
	}
	
	@RequestMapping( "/testMain.view" )
	public String testMain( Model model ) {
		return "/pages/test";
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
	
	//AGENT_CPU % TEST
	
	/* @SuppressWarnings("unchecked")
	@RequestMapping("/test/processListMap.do")
	public String processListMap(HttpServletRequest request, Model model) throws Exception {
		HashMap<String, Object> processListMap = new HashMap<String, Object>();
		processListMap.put("CPU_USAGE", request.getParameter("CPU_USAGE"));
		processListMap.put("PROCESS_NAME", request.getParameter("PROCESS_NAME"));
		processListMap.put("INSERT_DATE", request.getParameter("INSERT_DATE"));
		System.out.println(processListMap);
		
		List<String> list = new ArrayList<>();
		list = testService.processListMap(processListMap);
		
		model.addAttribute("processListMap",list);
		
		return "/pages/test2";
	} */
	
	@RequestMapping("/test/processListMap.do")
	public ModelAndView processListMap(HttpServletRequest request, Model model) throws Exception {
		/*
		ModelAndView mv = new ModelAndView();

		HashMap<String, Object> processListMap = new HashMap<String, Object>();
		processListMap.put("CPU_USAGE", request.getParameter("CPU_USAGE"));
		processListMap.put("PROCESS_NAME", request.getParameter("PROCESS_NAME"));
		processListMap.put("INSERT_DATE", request.getParameter("INSERT_DATE"));
		System.out.println(processListMap);
		
//		List<String> list = new ArrayList<>();
//		list = testService.processListMap(processListMap);
		List<HashMap> list = new ArrayList<>();
		list = testService.processListMap( processListMap );
		
		mv.addObject("processListMap", list);
		mv.setViewName("/pages/widgets/custom/test/agent_chart");
		return mv;
		*/
		
		ModelAndView mv = new ModelAndView( new MappingJackson2JsonView() );
		mv.addObject( "RESULT", testService.processListMap( new HashMap() ) );
		mv.setViewName("/pages/widgets/custom/test/agent_chart");
		return mv;
	}
	
	/////////////////////////////////////////////////////////////
	
	
	
	
	
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
