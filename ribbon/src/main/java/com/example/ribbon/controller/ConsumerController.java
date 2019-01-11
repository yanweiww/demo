package com.example.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by TC20021 on 2018/12/29.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/ribbon-consumer")
    public String HelloController(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hi",String.class).getBody();
    }
}
