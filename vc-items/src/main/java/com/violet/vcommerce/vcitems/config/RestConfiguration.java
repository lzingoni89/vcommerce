package com.violet.vcommerce.vcitems.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {

    @Bean("productAPI")
    public RestTemplate registrarProductAPI() {
        return new RestTemplateBuilder()
                .rootUri("http://localhost:8001/api/product")
                .build();
    }

}
