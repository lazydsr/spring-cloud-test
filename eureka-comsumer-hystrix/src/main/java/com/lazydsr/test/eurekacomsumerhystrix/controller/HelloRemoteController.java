package com.lazydsr.test.eurekacomsumerhystrix.controller;

import com.lazydsr.test.eurekacomsumerhystrix.proxy.HelloProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName : HelloRemoteController
 * <p>
 * ProjectName : spring-cloud-test
 * <p>
 * PackageName : com.lazydsr.springcloud.test.eurekaconsumer.controller
 * <p>
 * Description : TODO
 *
 * @author : daisenrong
 * @version : 1.0.0
 * @date : 2019/01/29 01:56
 */
@RestController
@RequestMapping("hello")
public class HelloRemoteController {
    @Autowired
    HelloProxy helloProxy;

    @GetMapping
    public String index(String name) {
        return helloProxy.hello(name + "!");
    }
}
