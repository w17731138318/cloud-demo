package com.wwx.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-08-31 17:38
 * @see
 **/
@SpringBootApplication
public class DubboProviderDemo {

	public static void main(String[] args) {

		new SpringApplicationBuilder(DubboProviderDemo.class)
				.web(WebApplicationType.NONE)
				.run(args);

	}

}
