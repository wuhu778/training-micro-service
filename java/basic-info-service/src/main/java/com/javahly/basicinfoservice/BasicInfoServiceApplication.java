package com.javahly.basicinfoservice;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootApplication
@MapperScan("com.javahly.basicinfoservice.dao")
@EnableApolloConfig
public class BasicInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicInfoServiceApplication.class, args);
	}


}
