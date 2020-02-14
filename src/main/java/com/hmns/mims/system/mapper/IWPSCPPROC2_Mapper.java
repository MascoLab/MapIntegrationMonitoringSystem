package com.hmns.mims.system.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.system.IWPSCPPROC2_ConnMapper;

@IWPSCPPROC2_ConnMapper
public interface IWPSCPPROC2_Mapper {
	/**
	 *	Extended_POI 보유 현황(전체 건수, 종별별 건수)
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCACntList( HashMap param );
	
	/**
	 *	Extended_POI 보유 현황(CP출처별 현황)
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCPCntList( HashMap param );
}
