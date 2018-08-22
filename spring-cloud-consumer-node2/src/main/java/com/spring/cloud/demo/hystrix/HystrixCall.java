package com.spring.cloud.demo.hystrix;

import com.spring.cloud.demo.feigncall.FeignRomateCall;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author jacksong
 * Created by  on 2018/8/22
 */
@Component
public class HystrixCall implements FeignRomateCall {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello,"+name+" this is  failer";
    }

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello2,"+name+" this is  failer";
    }
}
