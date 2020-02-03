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
	/**
	 * COMMONE_CODE 파라미터 정보
	 * code
	 * parentCode
	 * codeName
	 * codeDesc
	 * codeOrder
	 * useYN
	 * INSERT_USER - userName
	 * INSERT_DATE - GETDATE()
	 * UPDATE_USER - userName
	 * UPDATE_DATE - GETDATE()
	 * @return
	 */
	@RequestMapping( "/common/selectCodeListCnt.do" )
	@ResponseBody	
	public int selectCodeListCnt(Model model) {
		return commonService.selectCodeListCnt( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" ) 
	@RequestMapping( "/common/selectCodeList.do" )
	@ResponseBody
	public List<HashMap> selectCodeList( Model model ) {
		return commonService.selectCodeList( new HashMap<>() );
	}
	
	@RequestMapping( "/common/deleteCode.do" )
	@ResponseBody	
	public int deleteCode(Model model) {
		return commonService.deleteCode( new HashMap<>() );
	}
}
