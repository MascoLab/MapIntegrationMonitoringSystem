package com.hmns.mims.system.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.system.IWPSADASMAIN_ConnMapper;

@IWPSADASMAIN_ConnMapper
public interface IWPSADASMAIN_Mapper {
	/**
	 *	도로종별별 HDMap 구축 연장
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectRoadKindLengthList( HashMap param );
}
