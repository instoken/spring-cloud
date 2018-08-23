package com.spring.cloud.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacksong
 * Created by  on 2018/8/23
 */
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        log.info("request two name is "+name);
        try{
            Thread.sleep(1000000);
        }catch ( Exception e){
            log.error(" hello two error",e);
        }
        return "hello "+name+"，this is two messge";
    }
}
