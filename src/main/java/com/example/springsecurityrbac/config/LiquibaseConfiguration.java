package com.example.springsecurityrbac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;

import javax.sql.DataSource;

import liquibase.integration.spring.SpringLiquibase;

/**
 * @author : toryzhou
 * @date : 3/25/19 10:51
 */
@Configuration
public class LiquibaseConfiguration {

    /**
     * 用户模块Liquibase
     */
    @Bean
    public SpringLiquibase userLiquibase(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        // 用户模块Liquibase文件路径
        liquibase.setChangeLog("classpath:liquibase/user/master.xml");
        liquibase.setDataSource(dataSource);
        liquibase.setShouldRun(true);
        liquibase.setResourceLoader(new DefaultResourceLoader());
        // 覆盖Liquibase changelog表名
        liquibase.setDatabaseChangeLogTable("user_changelog_table");
        liquibase.setDatabaseChangeLogLockTable("user_changelog_lock_table");
        return liquibase;
    }

}
