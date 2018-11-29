package com.wwx.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwx.service.DemoService;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-08-31 17:39
 * @see
 **/
@Service(
		version = "${demo.service.version}",
		application = "${dubbo.application.id}",
		protocol = "${dubbo.protocol.id}",
		registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

	public String sayHello(String name) {
		return "Hello, " + name + " 111(from Spring Boot)";
	}

}
