package org.ligson.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ligso on 2016/12/20.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        System.out.println("add...........");
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=1&b=20",String.class).getBody();
    }
}
