package org.ligson.cloud.provider.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ligson on 2016/12/20.
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("org.ligson.cloud.provider")
public class AppMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AppMain.class).web(true).run(args);
    }
}
