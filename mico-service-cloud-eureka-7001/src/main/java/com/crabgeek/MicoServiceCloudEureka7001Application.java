package com.crabgeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: eurekademo
 * @description:
 * @author: Guipeng.Xie
 * @create: 2022-06-05 21:39
 */

@SpringBootApplication
@EnableEurekaServer //开启 Eureka server,接受其他微服务的注册
public class MicoServiceCloudEureka7001Application {
    public static void main(String[] args) {
        SpringApplication.run(MicoServiceCloudEureka7001Application.class, args);
    }
}
