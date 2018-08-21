package com.spring.cloud.demo.controller;

import com.spring.cloud.demo.feigncall.FeignRomateCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    FeignRomateCall feignRomateCall;

    @RequestMapping(value = "say")
    public String sayHello(
            @RequestParam String name
    ){
       return feignRomateCall.hello(name);
    }
}
