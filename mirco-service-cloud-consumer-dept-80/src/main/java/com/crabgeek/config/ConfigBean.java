package com.crabgeek.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced // 客户端使用RestTemplate 请求服务端时，开启负载均衡 (Ribbon)
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
