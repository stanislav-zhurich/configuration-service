package com.stan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigurationApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigurationApplication.class, args);
	}

}
