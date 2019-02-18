package com.lazydsr.springcloud.test.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        long l1 = l / 1000;
        System.out.println(l1);
        long l2 = l % 1000;
        System.out.println(l2);
        //SpringApplication.run(EurekaServerApplication.class, args);
    }

}

