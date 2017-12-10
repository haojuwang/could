package com.leyue.user.controller;


import com.leyue.user.model.User;
import com.leyue.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RequestMapping("user")
@RestController
public class UserContronller {

    @Autowired
    private UserService userService;


    private Logger logger = LoggerFactory.getLogger(UserContronller.class);


    @Value("${server.port}")
    private int port;

    @GetMapping("find")
    public List<User> find(@RequestParam("name") String username) {

        logger.error(port+"   有人访问了：   "+username);
       return userService.findByName(username);
    }


    @GetMapping("insert")
    public User insert(@RequestParam("name") String username) {

        User user = new User();
        user.setUsername(username);
        user.setAddress("北京");
        user.setSex(1+"");
        user.setBirthday(new Date());

        userService.insertUser(user);



        return user;
    }



}
