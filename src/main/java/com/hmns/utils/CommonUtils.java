package com.hmns.utils;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

public class CommonUtils {
	private static ResourceBundle config = ResourceBundle.getBundle( "config" );

	@SuppressWarnings( { "rawtypes", "unchecked" } )
	public static Map getParamMap( HttpServletRequest request ) throws Exception {
		Map paramMap = new HashMap();
		Enumeration names = request.getParameterNames();
		
		while ( names.hasMoreElements() ) {
			String name = ( String ) names.nextElement();
			String tmp = request.getParameter( name );
			if ( name.indexOf( "arr" ) > -1 ) {
				String[] arr = tmp.split( "," );
				paramMap.put( name, arr );
			} else {
				paramMap.put( name, tmp );
			}
		}
		
		return paramMap;
	}
	
	@SuppressWarnings( { "rawtypes", "unchecked" } )
	public static Map getNoEmptyParamMap( HttpServletRequest request ) throws Exception {
		Map paramMap = new HashMap();
		Enumeration names = request.getParameterNames();
		
		while ( names.hasMoreElements() ) {
			String name = ( String ) names.nextElement();
			String tmp = request.getParameter( name );
			if( !tmp.equals( "" ) ) {
				if ( name.indexOf( "arr" ) > -1 ) {
					String[] arr = tmp.split( "," );
					paramMap.put( name, arr );
				} else {
					paramMap.put( name, tmp );
				}
			}
		}
		return paramMap;
	}
}
