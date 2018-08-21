package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaConsumerBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerBootstrap.class, args);
    }
}
