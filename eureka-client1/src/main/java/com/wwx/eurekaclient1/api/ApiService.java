package com.wwx.eurekaclient1.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 */
@FeignClient(name = "client")
public interface ApiService {
	/**
	 * 微服务 提供的方法
	 * @return
	 */
	@GetMapping("/client/test")
	String apiGetTest();
}
