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
@MapperScan( value = "com.hmns", annotationClass = IWPSSYNC_ConnMapper.class, sqlSessionFactoryRef = "iwpssyncSqlSessionFactory" )
@EnableTransactionManagement
public class IWPSSYNC_DatabaseConfig {
	@Bean( name = "iwpssyncDataSource", destroyMethod = "close" )
	@ConfigurationProperties( prefix = "spring.iwpssync.datasource" )
	public DataSource iwpssyncDataSource() {
		return DataSourceBuilder.create().type( HikariDataSource.class ).build();
	}
	
	@Bean( name = "iwpssyncSqlSessionFactory" )
	public SqlSessionFactory iwpssyncSqlSessionFactory( @Qualifier( "iwpssyncDataSource" ) DataSource iwpssyncDataSource ) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource( iwpssyncDataSource );
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean( name = "iwpssyncSqlSessionTemplate" )
	public SqlSessionTemplate iwpssyncSqlSessionTemplate( SqlSessionFactory iwpssyncSqlSessionFactory ) throws Exception {
		return new SqlSessionTemplate( iwpssyncSqlSessionFactory );
	}
}
