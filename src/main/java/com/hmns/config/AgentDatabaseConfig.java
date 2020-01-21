package com.hmns.config;

import javax.sql.DataSource;

import org.apache.catalina.core.ApplicationContext;
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
@MapperScan( value = "com.hmns", annotationClass = AgentConnMapper.class, sqlSessionFactoryRef = "agentSqlSessionFactory" )
@EnableTransactionManagement
public class AgentDatabaseConfig {
	
	@Bean( name = "agentDataSource", destroyMethod = "close" )
	@ConfigurationProperties( prefix = "spring.agent.datasource" )
	public DataSource agentDataSource() {
		return DataSourceBuilder.create().type( HikariDataSource.class ).build();
	}
	
	@Bean( name = "agentSqlSessionFactory" )
	public SqlSessionFactory agentSqlSessionFactory( @Qualifier( "agentDataSource" ) DataSource agentDataSource ) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource( agentDataSource );
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean( name = "agentSqlSessionTemplate" )
	public SqlSessionTemplate agentSqlSessionTemplate( SqlSessionFactory agentSqlSessionFactory ) throws Exception {
		return new SqlSessionTemplate( agentSqlSessionFactory );
	}
}
