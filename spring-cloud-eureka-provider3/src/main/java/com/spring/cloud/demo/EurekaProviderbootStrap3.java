package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderbootStrap3 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderbootStrap3.class, args);
    }
}
