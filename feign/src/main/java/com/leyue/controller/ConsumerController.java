package com.leyue.controller;


import com.leyue.service.UserService;
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


    private Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private UserService userService;


    @RequestMapping("user")
    public String user(String name) {
       return userService.getUser(name);
    }


}
