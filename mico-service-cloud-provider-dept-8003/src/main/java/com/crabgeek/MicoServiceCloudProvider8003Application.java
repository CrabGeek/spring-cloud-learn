package com.crabgeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: eurekademo
 * @description:
 * @author: Guipeng.Xie
 * @create: 2022-06-18 16:19
 */
@SpringBootApplication
@EnableEurekaClient
public class MicoServiceCloudProvider8003Application {
    public static void main(String[] args) {
        SpringApplication.run(MicoServiceCloudProvider8003Application.class, args);
    }
}
