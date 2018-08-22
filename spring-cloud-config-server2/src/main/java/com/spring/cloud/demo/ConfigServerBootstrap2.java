package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerBootstrap2 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBootstrap2.class, args);
    }
}
