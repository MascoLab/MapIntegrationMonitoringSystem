package com.hmns.mims.widget.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.MIMSConnMapper;

@MIMSConnMapper
public interface TabMapper {
	@SuppressWarnings( "rawtypes" )
	public int selectTabListCnt( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectTabList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int insertTab( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int updateTab( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int deleteTab( HashMap param );
}
