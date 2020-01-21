package com.hmns.test.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmns.test.mapper.TestMapper;

@Service
@Transactional
public class TestService {
	@Autowired
	private TestMapper testMapper;
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCommonCodeList( HashMap param ) {
		return testMapper.selectCommonCodeList( param );
	}
}
