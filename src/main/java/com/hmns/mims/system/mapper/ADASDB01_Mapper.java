package com.hmns.mims.system.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.system.ADASDB01_ConnMapper;

@ADASDB01_ConnMapper
public interface ADASDB01_Mapper {
	/**
	 *	도로종별별 ADAS 구축 연장
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectRoadKindAdasLengthList( HashMap param );
}
