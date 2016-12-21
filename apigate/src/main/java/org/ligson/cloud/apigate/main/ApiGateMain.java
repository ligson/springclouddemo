package org.ligson.cloud.apigate.main;

import org.ligson.cloud.apigate.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by ligson on 2016/12/21.
 */
@EnableZuulProxy
@SpringCloudApplication
public class ApiGateMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGateMain.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
