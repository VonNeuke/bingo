package com.liuke.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(basePackages = MysqlMybatisConfig.PACKAGE)
public class MysqlMybatisConfig extends BaseMybatisConfig {
    public static final String PACKAGE = "com.liuke.dao";
    public static final String MAPPER_LOCATION = "classpath:mapper/*.xml";
    public static final String DOMAIN_PACKAGE = "com.liuke.domain";

    @Autowired
    @Qualifier("mysqlDataSource")
    private DataSource mysqlDataSource;

    @Bean("mysqlSqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory() throws IOException {
        return super.createSqlSessionFactoryBean(mysqlDataSource, DOMAIN_PACKAGE, MAPPER_LOCATION);
    }

}
