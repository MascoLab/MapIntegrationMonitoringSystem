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
@MapperScan( value = "com.hmns", annotationClass = ADASDB01_ConnMapper.class, sqlSessionFactoryRef = "adasdb01SqlSessionFactory" )
@EnableTransactionManagement
public class ADASDB01_DatabaseConfig {
	@Bean( name = "adasdb01DataSource", destroyMethod = "close" )
	@ConfigurationProperties( prefix = "spring.adasdb01.datasource" )
	public DataSource adasdb01DataSource() {
		return DataSourceBuilder.create().type( HikariDataSource.class ).build();
	}
	
	@Bean( name = "adasdb01SqlSessionFactory" )
	public SqlSessionFactory adasdb01SqlSessionFactory( @Qualifier( "adasdb01DataSource" ) DataSource adasdb01DataSource ) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource( adasdb01DataSource );
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean( name = "adasdb01SqlSessionTemplate" )
	public SqlSessionTemplate adasdb01SqlSessionTemplate( SqlSessionFactory adasdb01SqlSessionFactory ) throws Exception {
		return new SqlSessionTemplate( adasdb01SqlSessionFactory );
	}
}
