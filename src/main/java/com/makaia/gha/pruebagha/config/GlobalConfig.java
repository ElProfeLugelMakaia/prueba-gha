package com.makaia.gha.pruebagha.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfig {

    @Value("${makaia.presentation}")
    private String makaiaPresentation;

    void GlobalConfig(){
        System.out.println(makaiaPresentation);
    }

    public String getMakaiaPresentation(){
        return this.makaiaPresentation;
    }
}
