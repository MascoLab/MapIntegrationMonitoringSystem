package com.hmns.mims.system.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.system.IWPSSYNC_ConnMapper;

@IWPSSYNC_ConnMapper
public interface IWPSSYNC_Mapper {
	/**
	 *	조회 당일 기준 도로종별 기준 연장
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectRoadKindLengthList( HashMap param );
	
	/**
	 *	조회 당일 기준 도로종별별 전체 연장, 자동차전용도로 연장
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectRoadKindCarPrivateLengthList( HashMap param );
	
	/**
	 *	월별 과금형카메라 변경 현황(최근2년)
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCameraPenaltyCntList( HashMap param );
	
	/**
	 *	컨텐츠통계_마법사_SDMAP_도로
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectSdmapRoadInfoList( HashMap param );
	
	/**
	 *	컨텐츠통계_마법사_SDMAP_안전운행
	 *	@param param
	 *	@return
	 */
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectSdmapRoadSafeInfoList( HashMap param );
}
