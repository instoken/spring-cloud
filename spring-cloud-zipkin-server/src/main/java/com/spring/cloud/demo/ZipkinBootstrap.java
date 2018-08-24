package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @Author jacksong
 * Created by  on 2018/8/24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinBootstrap.class, args);
    }
}
