package com.wwx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-08-31 17:47
 * @see
 **/
@SpringBootApplication(scanBasePackages = "com.wwx.consumer.web")
public class DubboConsumerDemo {

	public static void main(String[] args) {

		SpringApplication.run(DubboConsumerDemo.class,args);

	}

}
