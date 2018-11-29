package com.wwx.enrekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EnrekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrekaClientApplication.class, args);
	}
}
