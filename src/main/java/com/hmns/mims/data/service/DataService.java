package com.hmns.mims.data.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmns.mims.data.mapper.InfoMapper;
import com.hmns.mims.data.mapper.QueryMapper;
import com.hmns.mims.data.mapper.ServerMapper;

@Service
public class DataService {
	@Autowired
	private InfoMapper infoMapper;
	
	@Autowired
	private QueryMapper queryMapper;
	
	@Autowired
	private ServerMapper serverMapper;
	
	////////////////////////////////////////////////////////////
	//	데이터 정보
	////////////////////////////////////////////////////////////
	@SuppressWarnings( "rawtypes" )
	public int selectInfoListCnt( HashMap param ) {
		return infoMapper.selectInfoListCnt( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectInfoList( HashMap param ) {
		return infoMapper.selectInfoList( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int insertInfo( HashMap param ) {
		return infoMapper.insertInfo( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int updateInfo( HashMap param ) {
		return infoMapper.updateInfo( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int deleteInfo( HashMap param ) {
		return infoMapper.deleteInfo( param );
	}
	
	////////////////////////////////////////////////////////////
	//	쿼리 정보
	////////////////////////////////////////////////////////////
	@SuppressWarnings( "rawtypes" )
	public int selectQueryListCnt( HashMap param ) {
		return queryMapper.selectQueryListCnt( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectQueryList( HashMap param ) {
		return queryMapper.selectQueryList( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int insertQuery( HashMap param ) {
		return queryMapper.insertQuery( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int updateQuery( HashMap param ) {
		return queryMapper.updateQuery( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int deleteQuery( HashMap param ) {
		return queryMapper.deleteQuery( param );
	}
	
	////////////////////////////////////////////////////////////
	//	서버 정보
	////////////////////////////////////////////////////////////
	@SuppressWarnings( "rawtypes" )
	public int selectServerListCnt( HashMap param ) {
		return serverMapper.selectServerListCnt( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectServerList( HashMap param ) {
		return serverMapper.selectServerList( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int insertServer( HashMap param ) {
		return serverMapper.insertServer( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int updateServer( HashMap param ) {
		return serverMapper.updateServer( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int deleteServer( HashMap param ) {
		return serverMapper.deleteServer( param );
	}
}
