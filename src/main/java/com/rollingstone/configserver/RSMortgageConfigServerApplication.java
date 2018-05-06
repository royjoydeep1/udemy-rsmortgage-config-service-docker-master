package com.rollingstone.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@EnableConfigServer
@EnableDiscoveryClient
public class RSMortgageConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RSMortgageConfigServerApplication.class, args);
	}

}
