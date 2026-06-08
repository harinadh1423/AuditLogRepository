package com.project.retailproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.project.retailproject.clients")
public class AuditLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditLogApplication.class, args);
	}

}
