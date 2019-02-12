package com.lazydsr.springcloud.test.eurekaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * FileName : HelloController
 * <p>
 * ProjectName : spring-cloud-test
 * <p>
 * PackageName : com.lazydsr.springcloud.test.eurekaprovider.controller
 * <p>
 * Description : TODO
 *
 * @author : daisenrong
 * @version : 1.0.0
 * @date : 2019/01/29 01:36
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String hello(String name) {
        return "Hello, " + name + " " + new Date();
    }
}
