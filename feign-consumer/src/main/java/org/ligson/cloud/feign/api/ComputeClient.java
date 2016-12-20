package org.ligson.cloud.feign.api;

import org.ligson.cloud.feign.component.ComputeClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ligso on 2016/12/20.
 */
@FeignClient(value = "compute-service",fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @RequestMapping("/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
