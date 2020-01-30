package com.hmns.mims.widget.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmns.mims.widget.mapper.BaseMapper;
import com.hmns.mims.widget.mapper.InfoMapper;
import com.hmns.mims.widget.mapper.LocationMapper;
import com.hmns.mims.widget.mapper.TabMapper;

@Service
public class WidgetService {
	@Autowired
	private InfoMapper infoMapper;
	
	@Autowired
	private TabMapper tabMapper;
	
	@Autowired
	private LocationMapper locationMapper;
	
	@Autowired
	private BaseMapper baseMapper;
	
	////////////////////////////////////////////////////////////
	//	위젯 정보
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
	//	탭 정보
	////////////////////////////////////////////////////////////
	@SuppressWarnings( "rawtypes" )
	public int selectTabListCnt( HashMap param ) {
		return tabMapper.selectTabListCnt( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectTabList( HashMap param ) {
		return tabMapper.selectTabList( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int insertTab( HashMap param ) {
		return tabMapper.insertTab( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int updateTab( HashMap param ) {
		return tabMapper.updateTab( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int deleteTab( HashMap param ) {
		return tabMapper.deleteTab( param );
	}
	
	////////////////////////////////////////////////////////////
	//	탭내 위젯 위치 정보
	////////////////////////////////////////////////////////////
	@SuppressWarnings( "rawtypes" )
	public int selectLocationListCnt( HashMap param ) {
		return locationMapper.selectLocationListCnt( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectLocationList( HashMap param ) {
		return locationMapper.selectLocationList( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int insertLocation( HashMap param ) {
		return locationMapper.insertLocation( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int updateLocation( HashMap param ) {
		return locationMapper.updateLocation( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int deleteLocation( HashMap param ) {
		return locationMapper.deleteLocation( param );
	}
	
	////////////////////////////////////////////////////////////
	//	기본 위젯 정보
	////////////////////////////////////////////////////////////
	@SuppressWarnings( "rawtypes" )
	public int selectBaseListCnt( HashMap param ) {
		return baseMapper.selectBaseListCnt( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectBaseList( HashMap param ) {
		return baseMapper.selectBaseList( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int insertBase( HashMap param ) {
		return baseMapper.insertBase( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int updateBase( HashMap param ) {
		return baseMapper.updateBase( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int deleteBase( HashMap param ) {
		return baseMapper.deleteBase( param );
	}
}
