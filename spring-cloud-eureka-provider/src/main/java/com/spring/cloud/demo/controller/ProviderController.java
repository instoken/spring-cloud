package com.spring.cloud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@RestController
@RequestMapping("/")
public class ProviderController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name){
        return "hello,"+name;
    }
}
