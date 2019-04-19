package org.willen.sc.gateway.admin.config;


import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.willen.sc.common.web.redis.RedisConfig;

@Configuration
@EnableCaching
public class MyRedisConfig extends RedisConfig {
}