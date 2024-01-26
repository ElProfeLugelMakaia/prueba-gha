package com.makaia.gha.pruebagha.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfig {

    @Value("${makaia.presentation}")
    private String makaiaPresentation;

    @Value("${global.env}")
    private String environment;


    public String getMakaiaPresentation(){
        return this.makaiaPresentation;
    }

    public String getEnvironment(){
        return this.environment;
    }
}
