package com.hmns.test.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.AgentConnMapper;

@AgentConnMapper
public interface TestAgentMapper {
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectServerResourceList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectServerProcessList( HashMap param );
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> processListMap(HashMap processListMap) throws Exception;
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> pcListMap(HashMap processListMap) throws Exception;
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> hddListMap(HashMap processListMap) throws Exception;

	@SuppressWarnings( "rawtypes" )
	public List<HashMap> hddListMap2(HashMap processListMap) throws Exception;
	
}
