package com.hmns.mims;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping( "/main.view" )
	public String main( Model model ) {
		return "/pages/main";
	}
}
