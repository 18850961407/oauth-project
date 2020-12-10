package com.demo.oauth2.server.server.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
* @author liyz
* @Description TODO
*/
@Data
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfig implements Serializable{
	private String host ;
	private int port ;
	private String password ;
    private int redisIndex;
	private int maxIdle;
	private int maxActive;
	private int maxWait;
	private boolean testOnBorrow;
}
