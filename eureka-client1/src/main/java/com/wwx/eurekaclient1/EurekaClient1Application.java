package com.wwx.eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1Application.class, args);
	}
}
