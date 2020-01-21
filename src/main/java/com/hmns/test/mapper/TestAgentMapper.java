package com.hmns.test.mapper;

import java.util.HashMap;
import java.util.List;

import com.hmns.config.AgentConnMapper;

@AgentConnMapper
public interface TestAgentMapper {
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectServerResourceList( HashMap param );
}
