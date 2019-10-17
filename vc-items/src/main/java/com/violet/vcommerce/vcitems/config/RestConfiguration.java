package com.violet.vcommerce.vcitems.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {

    @Bean("productAPI")
    @LoadBalanced
    public RestTemplate registrarProductAPI() {
        return new RestTemplateBuilder()
                .rootUri("http://vc-products/api/product/")
                .build();
    }

}
