package com.leyue.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("SPUER-USER")
public interface UserService {

    @RequestMapping(value = "/user/find",method = RequestMethod.GET)
    String getUser(@RequestParam("name") String name);
}
