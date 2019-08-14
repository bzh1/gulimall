package com.atguigu.gulimall.pms.config;

import com.zaxxer.hikari.HikariDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PmsGlobalTransactionConfig {

    //本地数据源
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource originDataSource(@Value("${spring.datasource.url}")String url){

        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(url);

        return hikariDataSource;

    }

    //代理数据源
    @Bean
    @Primary //将返回的对象作为默认的数据源
    public DataSource dataSource(DataSource dataSource) {

        return new DataSourceProxy(dataSource);

    }


}
