package com.demo.oauth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @author liyz
* @Description TODO
*/
@SpringBootApplication
@MapperScan(basePackages = "com.demo.oauth2.*.mapper")
public class OauthServerApplication{
	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}
}
