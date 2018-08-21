package com.spring.cloud.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@RestController
@RequestMapping("/")
public class HelloController {
    @Value("${jacksong}")
    private String hello;

    @RequestMapping(value = "hello")
    public String hello(){
        return hello;
    }
}
