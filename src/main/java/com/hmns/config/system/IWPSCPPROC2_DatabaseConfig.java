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
@MapperScan( value = "com.hmns", annotationClass = IWPSCPPROC2_ConnMapper.class, sqlSessionFactoryRef = "iwpscpproc2SqlSessionFactory" )
@EnableTransactionManagement
public class IWPSCPPROC2_DatabaseConfig {
	@Bean( name = "iwpscpproc2DataSource", destroyMethod = "close" )
	@ConfigurationProperties( prefix = "spring.iwpscpproc2.datasource" )
	public DataSource iwpscpproc2DataSource() {
		return DataSourceBuilder.create().type( HikariDataSource.class ).build();
	}
	
	@Bean( name = "iwpscpproc2SqlSessionFactory" )
	public SqlSessionFactory iwpscpproc2SqlSessionFactory( @Qualifier( "iwpscpproc2DataSource" ) DataSource iwpscpproc2DataSource ) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource( iwpscpproc2DataSource );
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean( name = "iwpscpproc2SqlSessionTemplate" )
	public SqlSessionTemplate iwpscpproc2SqlSessionTemplate( SqlSessionFactory iwpscpproc2SqlSessionFactory ) throws Exception {
		return new SqlSessionTemplate( iwpscpproc2SqlSessionFactory );
	}
}
