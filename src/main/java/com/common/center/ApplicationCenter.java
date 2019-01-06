package com.common.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenyoubing
 * @date 2019-01-06
 */
@EnableEurekaServer
@SpringBootApplication
public class ApplicationCenter {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationCenter.class, args);
	}

}

