package com.list.photoes.nebula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NebulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NebulaApplication.class, args);
	}

}
