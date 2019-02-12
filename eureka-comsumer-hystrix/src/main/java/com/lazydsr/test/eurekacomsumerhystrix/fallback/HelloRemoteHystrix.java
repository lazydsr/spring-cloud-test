package com.lazydsr.test.eurekacomsumerhystrix.fallback;

import com.lazydsr.test.eurekacomsumerhystrix.proxy.HelloProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FileName : HelloRemoteHystrix
 * <p>
 * ProjectName : spring-cloud-test
 * <p>
 * PackageName : com.lazydsr.test.eurekacomsumerhystrix.fallback
 * <p>
 * Description : TODO
 *
 * @author : daisenrong
 * @version : 1.0.0
 * @date : 2019/01/30 23:35
 */
@Component
public class HelloRemoteHystrix implements HelloProxy {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello World! fallback";
    }
}
