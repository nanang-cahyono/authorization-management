package com.izan.satpam.discovery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServiceApplication extends SpringBootServletInitializer{
	private final static Log LOGGER = LogFactory.getLog(EurekaServiceApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Starting Eureka Application");
		SpringApplication.run(EurekaServiceApplication.class, args);
	}
}
