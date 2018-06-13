package com.wwx.actuator.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-06-13 16:57
 * @see
 **/
@RestController
@RequestMapping("test")
public class TestController {

	@Value("${test.value}")
	private String testValue;
	@PostMapping("hello")
	public String hello(){
		return testValue;
	}
}
