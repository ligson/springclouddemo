package org.ligson.cloud.eureka.server.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by ligson on 2016/12/20.
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RegisterMain.class).web(true).run(args);
    }
}
