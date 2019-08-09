package com.example.mangodemo.admin.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry){

        registry.addMapping("/**")//允许跨域访问的路径
                .allowedOrigins("*") //允许跨域访问的资源
                .allowedMethods("POST","GET","OPTIONS","DELETE")
                .maxAge(16800)
                .allowedHeaders("*")
                .allowCredentials(true);
    }




}
