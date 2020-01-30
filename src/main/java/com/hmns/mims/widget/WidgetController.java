package com.hmns.mims.widget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hmns.mims.widget.service.WidgetService;

@Controller
public class WidgetController {
	@Autowired
	private WidgetService widgetService;
	
	
}
