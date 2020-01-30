package com.hmns.mims.data.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.MIMSConnMapper;

@MIMSConnMapper
public interface ServerMapper {
	@SuppressWarnings( "rawtypes" )
	public int selectServerListCnt( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectServerList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int insertServer( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int updateServer( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int deleteServer( HashMap param );
}
