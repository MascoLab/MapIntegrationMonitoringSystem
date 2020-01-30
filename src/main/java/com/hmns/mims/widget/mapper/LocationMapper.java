package com.hmns.mims.widget.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.MIMSConnMapper;

@MIMSConnMapper
public interface LocationMapper {
	@SuppressWarnings( "rawtypes" )
	public int selectLocationListCnt( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectLocationList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int insertLocation( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int updateLocation( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int deleteLocation( HashMap param );
}
