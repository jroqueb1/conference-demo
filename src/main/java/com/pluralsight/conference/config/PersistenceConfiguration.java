package com.pluralsight.conference.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration  {

/*    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app")
        .username(env.getProperty("spring.datasource.username"))
        .password(env.getProperty("spring.datasource.password"));
        System.out.println("My Custom datasource has been initialized!");
        return builder.build();
    }*/

}
