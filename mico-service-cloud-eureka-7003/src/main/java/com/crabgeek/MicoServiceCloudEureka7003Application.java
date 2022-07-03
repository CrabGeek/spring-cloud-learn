package com.crabgeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: eurekademo
 * @description:
 * @author: Guipeng.Xie
 * @create: 2022-06-18 17:41
 */
@SpringBootApplication
@EnableEurekaServer
public class MicoServiceCloudEureka7003Application {
    public static void main(String[] args) {
        SpringApplication.run(MicoServiceCloudEureka7003Application.class, args);
    }
}
