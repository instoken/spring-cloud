package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author jacksong
 * Created by  on 2018/8/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulProviderBootstrap1 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulProviderBootstrap1.class, args);
    }
}
