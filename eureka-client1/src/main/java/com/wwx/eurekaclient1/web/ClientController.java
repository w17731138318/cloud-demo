package com.wwx.eurekaclient1.web;

import com.wwx.eurekaclient1.api.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-11-29 11:55
 * @see
 **/
@Slf4j
@RestController
@RequestMapping("user")
public class ClientController {

//	@Autowired
//	private LoadBalancerClient loadBalancerClient;\

	//	@Autowired
//	private RestTemplate restTemplate;
	@Autowired
	private ApiService apiService;

	@GetMapping("/test")
	public String test(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			Arrays.stream(cookies).forEach(e -> {
				log.info("cookie={}", e.getName() + ":" + e.getValue());
			});
		}


		/**
		 * 方式一
		 */
//		RestTemplate restTemplate = new RestTemplate();
//		String object = restTemplate.getForObject("http://localhost:8080/client/test", String.class);
		/**
		 * 方式二
		 */
//		RestTemplate restTemplate = new RestTemplate();
//		ServiceInstance serviceInstance = loadBalancerClient.choose("CLIENT");
//		String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort())+"/client/test";
//		String object = restTemplate.getForObject(url, String.class);

		/**
		 * 方式三
		 */
//		String object = restTemplate.getForObject("http://CLIENT/client/test", String.class);

		/**
		 * 方式四
		 */
		String object = apiService.apiGetTest();
		log.info("object={}", object);
		return object;
	}
}
