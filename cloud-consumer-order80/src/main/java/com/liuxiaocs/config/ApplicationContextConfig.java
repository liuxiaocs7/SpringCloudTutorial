package com.liuxiaocs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    /**
     * 将restTemplate注入容器
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
