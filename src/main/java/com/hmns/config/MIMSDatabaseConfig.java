package com.hmns.config;

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
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan( value = "com.hmns", annotationClass = MIMSConnMapper.class, sqlSessionFactoryRef = "mimsSqlSessionFactory" )
@EnableTransactionManagement
public class MIMSDatabaseConfig {
	
	@Bean( name = "mimsDataSource", destroyMethod = "close" )
	@Primary
	@ConfigurationProperties( prefix = "spring.mims.datasource" )
	public DataSource mimsDataSource() {
		return DataSourceBuilder.create().type( HikariDataSource.class ).build();
	}
	
	@Bean( name = "mimsSqlSessionFactory" )
	@Primary
	public SqlSessionFactory mimsSqlSessionFactory( @Qualifier( "mimsDataSource" ) DataSource mimsDataSource ) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource( mimsDataSource );
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean( name = "mimsSqlSessionTemplate" )
	@Primary
	public SqlSessionTemplate mimsSqlSessionTemplate( SqlSessionFactory mimsSqlSessionFactory ) throws Exception {
		return new SqlSessionTemplate( mimsSqlSessionFactory );
	}
}
