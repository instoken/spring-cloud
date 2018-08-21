package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServersBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServersBootstrap.class, args);
    }
}
