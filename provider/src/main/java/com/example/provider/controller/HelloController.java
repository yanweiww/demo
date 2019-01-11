package com.example.provider.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by TC20021 on 2018/12/29.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hi")
    public String index1(){
        List<ServiceInstance> instances = client.getInstances("hello-service");
        for(int i=0;i<instances.size();i++){
            logger.info("/hello,host:"+instances.get(i).getHost()+",service_id:" + instances.get(i).getServiceId());
        }

        return "nice to meet you";
    }

}
