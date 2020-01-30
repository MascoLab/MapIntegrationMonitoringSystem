package com.hmns.mims.common.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmns.mims.common.mapper.CodeMapper;

@Service
public class CommonService {
	@Autowired
	private CodeMapper codeMapper;

	@SuppressWarnings( "rawtypes" )
	public int selectCodeListCnt( HashMap param ) {
		return codeMapper.selectCodeListCnt( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCodeList( HashMap param ) {
		return codeMapper.selectCodeList( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int insertCode( HashMap param ) {
		return codeMapper.insertCode( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int updateCode( HashMap param ) {
		return codeMapper.updateCode( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public int deleteCode( HashMap param ) {
		return codeMapper.deleteCode( param );
	}
}
