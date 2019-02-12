package com.lazydsr.springcloud.test.eurekaconsumer.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FileName : HelloProxy
 * <p>
 * ProjectName : spring-cloud-test
 * <p>
 * PackageName : com.lazydsr.springcloud.test.eurekaconsumer.proxy
 * <p>
 * Description : TODO
 *
 * @author : daisenrong
 * @version : 1.0.0
 * @date : 2019/01/29 01:55
 */
@FeignClient(name = "eureka-provider")
public interface HelloProxy {
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
