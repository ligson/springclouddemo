package org.ligson.cloud.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ligson on 2016/12/20.
 */
@RestController
public class ComputeController {
    private static Logger logger = LoggerFactory.getLogger(ComputeController.class);
    @Autowired
    private DiscoveryClient discoveryClient;

    //提供接口必须把requestparam写完整，客户端使用feign的时候必须跟这个方法完全一样，不要使用简单类型
    @RequestMapping("/add")
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + (a + b));
        return a + b;
    }
}
