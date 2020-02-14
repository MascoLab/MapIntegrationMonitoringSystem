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
@MapperScan( value = "com.hmns", annotationClass = IWPSADASMAIN_ConnMapper.class, sqlSessionFactoryRef = "iwpsadasmainSqlSessionFactory" )
@EnableTransactionManagement
public class IWPSADASMAIN_DatabaseConfig {
	@Bean( name = "iwpsadasmainDataSource", destroyMethod = "close" )
	@ConfigurationProperties( prefix = "spring.iwpsadasmain.datasource" )
	public DataSource iwpsadasmainDataSource() {
		return DataSourceBuilder.create().type( HikariDataSource.class ).build();
	}
	
	@Bean( name = "iwpsadasmainSqlSessionFactory" )
	public SqlSessionFactory iwpsadasmainSqlSessionFactory( @Qualifier( "iwpsadasmainDataSource" ) DataSource iwpsadasmainDataSource ) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource( iwpsadasmainDataSource );
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean( name = "iwpsadasmainSqlSessionTemplate" )
	public SqlSessionTemplate iwpsadasmainSqlSessionTemplate( SqlSessionFactory iwpsadasmainSqlSessionFactory ) throws Exception {
		return new SqlSessionTemplate( iwpsadasmainSqlSessionFactory );
	}
}
