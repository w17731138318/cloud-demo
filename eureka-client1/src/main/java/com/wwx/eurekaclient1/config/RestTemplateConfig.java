package com.wwx.eurekaclient1.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfig
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-11-29 15:08
 * @see
 **/
@Component
public class RestTemplateConfig {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
