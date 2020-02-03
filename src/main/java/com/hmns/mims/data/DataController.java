package com.hmns.mims.data;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmns.mims.data.service.DataService;

@Controller
public class DataController {
	@Autowired
	private DataService dataService;
	
	//DataInfoMapper
	/**
	 * DATA_INFO 파라미터 정보
	 * dataSeq
	 * serverSeq
	 * querySeq
	 * dataName
	 * dataDesc
	 * useuserID
	 * INSERT_DATE - GETDATE()
	 * UPDATE_DATE - GETDATE()
	 * @return
	 */
	@RequestMapping( "/data/selectInfoListCnt.do" )
	@ResponseBody
	public int selectInfoListCnt( Model model ) {
		return dataService.selectInfoListCnt( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/data/selectInfoList.do" )
	@ResponseBody
	public List<HashMap> selectInfoList( Model model ) {
		return dataService.selectInfoList( new HashMap<>() );
	}
	
	@RequestMapping( "/data/deleteInfo.do" )
	@ResponseBody	
	public int deleteInfo(Model model) {
		return dataService.deleteInfo( new HashMap<>() );
	}
	
	//QueryMapper
	/**
	 * DATA_QUERY 파라미터 정보
	 * querySeq
	 * queryName
	 * queryExec
	 * dataTypeCode
	 * queryDesc
	 * useuserID
	 * INSERT_DATE - GETDATE()
	 * UPDATE_DATE - GETDATE()
	 * @return
	 */
	@RequestMapping("/query/selectQueryListCnt.do")
	@ResponseBody
	public int selectQueryListCnt ( Model model) {
		return dataService.selectQueryListCnt( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping("/query/selectQueryList.do")
	@ResponseBody
	public List<HashMap> selectQueryList(Model model){
		return dataService.selectQueryList( new HashMap<>() );
	}
	
	@RequestMapping("/query/deleteQuery.do")
	@ResponseBody
	public int deleteQuery(Model model) {
		return dataService.deleteQuery( new HashMap<>() );
	}
	
	//ServerMapper
	/**
	 * DATA_SERVER 파라미터 정보
	 * serverSeq
	 * serverName
	 * serverTypeCode
	 * serverDesc
	 * serverIp
	 * dbmsPort
	 * dbmsID
	 * dbmsPW
	 * dbmsNam
	 * useuserID
	 * INSERT_DATE - GETDATE()
	 * UPDATE_DATE - GETDATE()
	 * @return
	 */
	@RequestMapping("/server/selectServerListCnt.do")
	@ResponseBody
	public int selectServerListCnt (Model model) {
		return dataService.selectServerListCnt( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping("/server/selectServerList.do")
	@ResponseBody
	public List<HashMap> selectServerList (Model model){
		return dataService.selectServerList( new HashMap<>() );
	}

	@RequestMapping("/server/deleteServer.do")
	@ResponseBody
	public int deleteServer(Model model){
		return dataService.deleteServer( new HashMap<>() );
	}
	
	
}
