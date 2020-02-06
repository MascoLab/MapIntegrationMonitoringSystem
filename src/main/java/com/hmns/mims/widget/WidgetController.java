package com.hmns.mims.widget;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hmns.mims.widget.service.WidgetService;

@Controller
public class WidgetController {
	@Autowired
	private WidgetService widgetService;
	
	@RequestMapping( "/widget/getBaseWidget.view" )
	public ModelAndView getBaseWidget( @RequestParam( name = "widgetType" ) String widgetType, @RequestParam( name = "widgetName" ) String widgetName  ) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName( "/pages/widgets/base/" + widgetType + "/" + widgetName );
		return mv;
	}
	
	@RequestMapping( "/widget/getCustomWidget.view" )
	public ModelAndView getCustomWidget( @RequestParam( name = "widgetType" ) String widgetType, @RequestParam( name = "widgetName" ) String widgetName  ) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName( "/pages/widgets/custom/" + widgetType + "/" + widgetName );
		return mv;
	}
	
	
	
	// WIDGET_INFO
	/**
	 * WIDGET_INFO 파라미터 정보
	 * widgetSeq
	 * baseWidgetSeq
	 * dataSeq
	 * widgetName
	 * widgetUrl
	 * useuserID
	 * INSERT_DATE - GETDATE()
	 * UPDATE_DATE - GETDATE()
	 * @return
	 */
	@RequestMapping("/widget/selectInfoListCnt.do")
	@ResponseBody
	public int selectInfoListCnt(Model model) {
		return widgetService.selectInfoListCnt( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping("/widget/selectInfoList.do")
	@ResponseBody
	public List<HashMap> selectInfoList(Model model){
		return widgetService.selectInfoList( new HashMap<>() );
	}
	
	@RequestMapping("/widget/deleteInfo.do")
	@ResponseBody	
	public int deleteInfo(Model model) {
		return widgetService.deleteInfo( new HashMap<>() );
	}
	
	
	// WIDGET_LOCATION
	/**
	 * WIDGET_LOCATION 파라미터 정보
	 * locationSeq
	 * tabSeq
	 * widgetSeq
	 * locationOrder
	 * locationX
	 * locationY
	 * locationWidth
	 * locationHeight
	 * @return
	 */
	@RequestMapping("/widget/selectLocationListCnt.do")
	@ResponseBody	
	public int selectLocationListCnt(Model model) {
		return widgetService.selectLocationListCnt( new HashMap<>() );
	}

	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/widget/selectLocationList.do" )
	@ResponseBody
	public List<HashMap> selectLocationList(Model model){
		return widgetService.selectLocationList( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/widget/deleteLocation.do" )
	@ResponseBody
	public int deleteLocation(Model model) {
		return widgetService.deleteLocation( new HashMap<>() );
	}
	
	// WIDGET_TAB
	/**
	 * WIDGET_TAB 파라미터 정보
	 * tabSeq
	 * tabName
	 * tabOrder
	 * useuserID
	 * INSERT_DATE - GETDATE()
	 * UPDATE_DATE - GETDATE()
	 * @return
	 */
	@RequestMapping( "/widget/selectTabListCnt.do" )
	@ResponseBody	
	public int selectTabListCnt(Model model) {
		return widgetService.selectTabListCnt( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/widget/selectTabList.do" )
	@ResponseBody
	public List<HashMap> selectTabList(Model model){
		return widgetService.selectTabList( new HashMap<>() );
	}
	
	@RequestMapping( "/widget/deleteTab.do" )
	@ResponseBody	
	public int deleteTab(Model model) {
		return widgetService.deleteTab( new HashMap<>() );
	}
	
	// WIDGET_BASE
	/**
	 * WIDGET_BASE 파라미터 정보
	 * baseWidgetSeq
	 * baseWidgetName
	 * baseWidgetUrl
	 * baseWidgetTypeCode
	 * baseWidgetWidth
	 * baseWidgetHeight
	 * baseOrder
	 * @return
	 */
	@RequestMapping( "/widget/selectBaseListCnt.do" )
	@ResponseBody
	public int selectBaseListCnt(Model model) {
		return widgetService.selectBaseListCnt( new HashMap<>() );
	}
	
	@SuppressWarnings( "rawtypes" )
	@RequestMapping( "/widget/selectBaseList.do" )
	@ResponseBody
	public List<HashMap> selectBaseList(Model model) {
		return widgetService.selectBaseList( new HashMap<>() );
	}
	
	@RequestMapping( "/widget/deleteBase.do" )
	@ResponseBody	
	public int deleteBase(Model model) {
		return widgetService.deleteBase( new HashMap<>() );
	}
}
