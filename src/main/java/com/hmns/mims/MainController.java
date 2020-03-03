package com.hmns.mims;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping( "/dashboard/main.view" )
	public String main( Model model ) {
		return "/pages/main";
	}
	
	@RequestMapping(value = "/test.view")
	public String test( Model model ) {
		return "/pages/gridstack_Knockout_Test";
	}
	
	
	@RequestMapping( "/management/system.view" )
	public String system( Model model ) {
		return "/pages/management/system";
	}
	
	@RequestMapping( "/management/data.view" )
	public String data( Model model ) {
		return "/pages/management/data";
	}
	
	@RequestMapping( "/management/widget.view" )
	public String widget( Model model ) {
		return "/pages/management/widget";
	}
}

