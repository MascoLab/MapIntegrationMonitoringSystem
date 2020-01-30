package com.hmns.mims.data.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.MIMSConnMapper;

@MIMSConnMapper
public interface InfoMapper {
	@SuppressWarnings( "rawtypes" )
	public int selectInfoListCnt( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectInfoList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int insertInfo( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int updateInfo( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int deleteInfo( HashMap param );
}
