package com.leyue.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.leyue.user")
@EnableDiscoveryClient
public class SpUserApplication {

    public static void main(String[] arg) {
        SpringApplication.run(SpUserApplication.class,arg);


    }
}
