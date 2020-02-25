package com.hmns.test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmns.test.mapper.TestAgentMapper;
import com.hmns.test.mapper.TestMapper;

@Service
@Transactional
public class TestService {
	@Autowired
	private TestMapper testMapper;

	@Autowired
	private TestAgentMapper testAgentMapper; 
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectCommonCodeList( HashMap param ) {
		return testMapper.selectCommonCodeList( param );
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> selectServerResourceList( HashMap param ) {
		return testAgentMapper.selectServerResourceList( param );
	}
	
	
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> processListMap( HashMap processListMap ) throws Exception {
		List<HashMap> returnList = new ArrayList<>();
		List<HashMap> resultList = testAgentMapper.processListMap( processListMap );
	 	
		for( int idx = 0; idx < resultList.size(); idx++ ) {
			/* System.out.println( "START IDX : " + idx ); */
			HashMap returnMap = new HashMap<>();
			String tmpServerSeq = resultList.get( idx ).get( "SERVER_SEQ" ).toString();

			for( HashMap result : resultList ) {
				// tmpServerSeq = result.get( "SERVER_SEQ" ).toString();
				if( tmpServerSeq.equals( result.get( "SERVER_SEQ" ).toString())  ) {
					
					if( !returnMap.containsKey( "SERVER_SEQ" ) ) {
						returnMap.put( "SERVER_SEQ", result.get( "SERVER_SEQ" ).toString() );
					} else {
						if( returnMap.get( "SERVER_SEQ" ).toString().equals( result.get( "SERVER_SEQ" ).toString()) ) 
						{
							idx += 1; 
						}
					}
					if( result.containsKey( "CPU_USAGE" ) && result.containsKey( "MEMORY_USAGE" ) ) {
					returnMap.put( "SERVER_PROCESS_SEQ", result.get( "SERVER_PROCESS_SEQ").toString() );
					returnMap.put("INSERT_DATE", "'" + result.get("INSERT_DATE").toString() + "'");
					returnMap.put(result.get("PROCESS_NAME").toString() + "CPU_USAGE", result.get("CPU_USAGE").toString());
					returnMap.put( result.get( "PROCESS_NAME" ).toString() + "MEMORY_USAGE", result.get( "MEMORY_USAGE" ).toString() );
					}
//					returnMap.put( "SERVER_SEQ", result.get( "SERVER_SEQ" ).toString() );
				}
			}
			/* System.out.println( idx ); */
			returnList.add( returnMap );
//			idxX -= 2;
/*			
			for( int idxY = 0; idxY < resultList.size(); idxY++ ) {
				if( tmpServerSeq.equals( resultList.get( idxY ).get( "SERVER_SEQ" ).toString() ) ) {
					returnMap.put
				}
			}
*/
//			idx += 2;
		}
		// return testAgentMapper.processListMap( processListMap );
		
		return returnList;
	}
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> pcListMap( HashMap processListMap ) throws Exception {
		return testAgentMapper.pcListMap( processListMap );
	}
	
	/*
	 * @SuppressWarnings( "rawtypes" ) public List<HashMap> hddListMap( HashMap
	 * processListMap ) throws Exception { return testAgentMapper.hddListMap(
	 * processListMap ); }
	 */
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> hddListMap( HashMap processListMap ) throws Exception {
		List<HashMap> returnList = new ArrayList<>();
		List<HashMap> resultList = testAgentMapper.hddListMap( processListMap );
		for( int idx = 0; idx < resultList.size(); idx++ ) {
			 System.out.println( "START IDX : " + idx ); 
			HashMap returnMap = new HashMap<>();
			String tmpServerSeq = resultList.get( idx ).get( "SERVER_SEQ" ).toString();
			
			for( HashMap result : resultList ) {
				if( tmpServerSeq.equals( result.get( "SERVER_SEQ" ).toString())  ) {
					
					if( !returnMap.containsKey( "SERVER_SEQ" ) ) {
						returnMap.put( "SERVER_SEQ", result.get( "SERVER_SEQ" ).toString() );
					} else {
						if( returnMap.get( "SERVER_SEQ" ).toString().equals( result.get( "SERVER_SEQ" ).toString()) ) 
						{
							idx += 1; 
						}
					}
					
					returnMap.put( "HDD_NAME", result.get( "HDD_NAME").toString() );
					
					returnMap.put( "SERVER_HDD_SEQ", result.get( "SERVER_HDD_SEQ").toString() );
					returnMap.put("INSERT_DATE", "'" + result.get("INSERT_DATE").toString() + "'");
					/*returnMap.put(result.get("HDD_NAME").toString() + "HDD_USAGE", result.get("HDD_USAGE").toString());
					returnMap.put(result.get("HDD_NAME").toString() + "HDD_MAX", result.get("HDD_MAX").toString());*/
					returnMap.put(result.get("HDD_NAME").toString() + "HDD_CONVERT", result.get("HDD_CONVERT").toString());
				}
			}
			System.out.println( idx );
			returnList.add( returnMap );
		}
		return returnList;
	}
	
	
	
	@SuppressWarnings( "rawtypes" )
	public List<HashMap> hddListMap2( HashMap processListMap ) throws Exception {
		List<HashMap> returnList = new ArrayList<>();
		List<HashMap> resultList = testAgentMapper.hddListMap2( processListMap );
		for( int idx = 0; idx < resultList.size(); idx++ ) {
			 System.out.println( "START IDX : " + idx ); 
			HashMap returnMap = new HashMap<>();
			String tmpServerSeq = resultList.get( idx ).get( "SERVER_SEQ" ).toString();
			
			for( HashMap result : resultList ) {
				if( tmpServerSeq.equals( result.get( "SERVER_SEQ" ).toString())  ) {
					
					if( !returnMap.containsKey( "SERVER_SEQ" ) ) {
						returnMap.put( "SERVER_SEQ", result.get( "SERVER_SEQ" ).toString() );
					} else {
						if( returnMap.get( "SERVER_SEQ" ).toString().equals( result.get( "SERVER_SEQ" ).toString()) ) 
						{
							idx += 1; 
						}
					}
					
					returnMap.put( "HDD_NAME", result.get( "HDD_NAME").toString() );
					
					returnMap.put( "SERVER_HDD_SEQ", result.get( "SERVER_HDD_SEQ").toString() );
					returnMap.put("INSERT_DATE", "'" + result.get("INSERT_DATE").toString() + "'");
					/*returnMap.put(result.get("HDD_NAME").toString() + "HDD_USAGE", result.get("HDD_USAGE").toString());
					returnMap.put(result.get("HDD_NAME").toString() + "HDD_MAX", result.get("HDD_MAX").toString());*/
					returnMap.put(result.get("HDD_NAME").toString() + "HDD_CONVERT", result.get("HDD_CONVERT").toString());
				}
			}
			System.out.println( idx );
			returnList.add( returnMap );
		}
		return returnList;
	}	
	
}
