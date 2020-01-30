package com.hmns.mims.data.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.MIMSConnMapper;

@MIMSConnMapper
public interface QueryMapper {
	@SuppressWarnings( "rawtypes" )
	public int selectQueryListCnt( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectQueryList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int insertQuery( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int updateQuery( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int deleteQuery( HashMap param );
}
