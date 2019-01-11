package com.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>开启ribbon>>>>>>>>>");
	}

	/**
	 * @LoadBalanced注解，表示开启客户端负载均衡。
	 * @return
	 */
	@LoadBalanced
	@Bean
	RestTemplate restTemplate(){

		return new RestTemplate();
	}

}

