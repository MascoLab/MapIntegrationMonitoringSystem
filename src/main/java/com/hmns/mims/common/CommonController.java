package com.hmns.mims.common;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmns.mims.common.service.CommonService;

@Controller
public class CommonController {
	@Autowired
	private CommonService commonService;
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/common/getCodeList.do" )
	@ResponseBody
	public List<HashMap> getCodeList( Model model ) {
		return commonService.selectCodeList( new HashMap<>() );
	}
}
