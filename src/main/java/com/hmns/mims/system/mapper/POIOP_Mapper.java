package com.hmns.mims.system.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.system.POIOP_ConnMapper;

@POIOP_ConnMapper
public interface POIOP_Mapper {
	/**
	 *	CORE_POI 보유 현황(전체 건수, 종별별 건수)
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectPoiCACntList( HashMap param );
	
	/**
	 *	종별검색 건수만 a,b,c,d 별로 (종별 선택시마다 쿼리 다르게 호출해야함)
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectPoiCBCntList( HashMap param );
}
