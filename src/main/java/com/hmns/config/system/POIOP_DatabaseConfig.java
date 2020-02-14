package com.hmns.config.system;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan( value = "com.hmns", annotationClass = POIOP_ConnMapper.class, sqlSessionFactoryRef = "poiopSqlSessionFactory" )
@EnableTransactionManagement
public class POIOP_DatabaseConfig {
	@Bean( name = "poiopDataSource", destroyMethod = "close" )
	@ConfigurationProperties( prefix = "spring.poiop.datasource" )
	public DataSource poiopDataSource() {
		return DataSourceBuilder.create().type( HikariDataSource.class ).build();
	}
	
	@Bean( name = "poiopSqlSessionFactory" )
	public SqlSessionFactory poiopSqlSessionFactory( @Qualifier( "poiopDataSource" ) DataSource poiopDataSource ) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource( poiopDataSource );
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean( name = "poiopSqlSessionTemplate" )
	public SqlSessionTemplate poiopSqlSessionTemplate( SqlSessionFactory poiopSqlSessionFactory ) throws Exception {
		return new SqlSessionTemplate( poiopSqlSessionFactory );
	}
}
