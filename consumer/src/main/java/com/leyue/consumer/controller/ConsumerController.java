package com.leyue.consumer.controller;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;


    private Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @RequestMapping("user")
    public String user(String name) {
       return restTemplate.getForObject("http://xiaohaozi:123@spuer-user/user/find?name="+name,String.class);
    }


    @GetMapping("balacner")
    public Map<String,String> balacner() {
        ServiceInstance service = this.loadBalancerClient.choose("spuer-user");

        logger.error(service.getHost());
        logger.error(service.getUri().toString());
        logger.error(String.valueOf(service.getPort()));

        return service.getMetadata();
    }

//    @Autowired
//    private EurekaClient discoveryClient;
//
//
//    @RequestMapping("serviceUrl")
//    public String serviceUrl() {
//        InstanceInfo instance = discoveryClient.getNextServerFromEureka("SPUER-USER", false);
//
//        return instance.getHomePageUrl();
//    }




}
