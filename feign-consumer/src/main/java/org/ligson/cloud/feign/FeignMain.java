package org.ligson.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ligso on 2016/12/20.
 */
@SpringBootApplication
@ComponentScan("org.ligson.cloud.feign")
@EnableDiscoveryClient
@EnableFeignClients
public class FeignMain {
    public static void main(String[] args) {
        SpringApplication.run(FeignMain.class, args);
    }
}
