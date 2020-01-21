package com.hmns.test.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCommonCodeList( HashMap param );
}
