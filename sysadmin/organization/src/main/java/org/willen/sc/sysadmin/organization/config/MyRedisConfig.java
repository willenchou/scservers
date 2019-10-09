package org.willen.sc.sysadmin.organization.config;

import org.willen.sc.common.web.redis.RedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class MyRedisConfig extends RedisConfig {

}