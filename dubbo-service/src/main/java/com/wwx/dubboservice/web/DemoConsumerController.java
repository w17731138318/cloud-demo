package com.wwx.dubboservice.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wwx.dubboservice.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-08-31 16:19
 * @see
 **/
@RestController
public class DemoConsumerController {
	@Reference(version = "${demo.service.version}",
			application = "${dubbo.application.id}",
			url = "dubbo://localhost:12345")
	private DemoService demoService;

	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return demoService.sayHello(name);
	}
}
