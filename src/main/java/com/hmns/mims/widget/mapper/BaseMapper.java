package com.hmns.mims.widget.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.MIMSConnMapper;

@MIMSConnMapper
public interface BaseMapper {
	@SuppressWarnings( "rawtypes" )
	public int selectBaseListCnt( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectBaseList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int insertBase( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int updateBase( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int deleteBase( HashMap param );
}
