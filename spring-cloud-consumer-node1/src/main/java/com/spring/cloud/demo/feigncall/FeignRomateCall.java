package com.spring.cloud.demo.feigncall;

import com.spring.cloud.demo.hystrix.HystrixCall;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@FeignClient(name = "spring-cloud-producer",fallback = HystrixCall.class)
public interface FeignRomateCall {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name);
}
