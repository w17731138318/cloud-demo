package com.wwx.enrekaclient.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-11-29 11:55
 * @see
 **/
@RestController
@RequestMapping("client")
public class ClientController {
	@GetMapping("/test")
	public String test(){
		return "Hello World";
	}
}
