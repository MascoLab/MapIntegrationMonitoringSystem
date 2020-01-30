package com.hmns.mims.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hmns.mims.data.service.DataService;

@Controller
public class DataController {
	@Autowired
	private DataService dataService;
	
	
}
