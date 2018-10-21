package com.liuke.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

//@Configuration
public class MybatisConfig {
 /*   private DataSource dataSource;
    @Autowired
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean (){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("");
        try{
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        }catch(Exception e){}
        sqlSessionFactoryBean.setTypeAliasesPackage("com.liuke.domain");

        return sqlSessionFactoryBean;
    }*/
}
