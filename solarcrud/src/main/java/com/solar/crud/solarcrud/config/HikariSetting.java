package com.solar.crud.solarcrud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;

@Configuration
public class HikariSetting {
    @Bean
    public HikariConfig config() {
        HikariConfig hikariConfig = new HikariConfig();
        
        
        hikariConfig.addDataSourceProperty("socketTimeout", 600000);
        hikariConfig.setMaxLifetime(600000);
        
        return hikariConfig;
    }
}
