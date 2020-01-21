package com.hmns.test.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.MIMSConnMapper;

@MIMSConnMapper
public interface TestMapper {
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCommonCodeList( HashMap param );
}
