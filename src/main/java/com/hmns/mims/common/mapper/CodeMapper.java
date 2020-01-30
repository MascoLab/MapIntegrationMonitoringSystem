package com.hmns.mims.common.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.MIMSConnMapper;

@MIMSConnMapper
public interface CodeMapper {

	@SuppressWarnings( "rawtypes" )
	public int selectCodeListCnt( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCodeList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int insertCode( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int updateCode( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public int deleteCode( HashMap param );
}
