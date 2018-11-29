package com.wwx.dubboservice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwx.dubboservice.service.DemoService;


/**
 * DemoServiceService
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-08-31 16:16
 **/
@Service(
		version = "${demo.service.version}",
		application = "${dubbo.application.id}",
		protocol = "${dubbo.protocol.id}",
		registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + " (from Spring Boot)";
	}
}	