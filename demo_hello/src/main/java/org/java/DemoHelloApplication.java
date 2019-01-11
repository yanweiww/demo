package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoHelloApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoHelloApplication.class, args);
		System.out.println("dddddddddddddddddddddddddd");
	}



}
