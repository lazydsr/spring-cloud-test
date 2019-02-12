package com.lazydsr.test.eurekacomsumerhystrix.proxy;

import com.lazydsr.test.eurekacomsumerhystrix.fallback.HelloRemoteHystrix;
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
@FeignClient(name = "eureka-provider", fallback = HelloRemoteHystrix.class)
public interface HelloProxy {
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
