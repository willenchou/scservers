package org.willen.sc.gateway.admin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 初使化Mybatis审计字段自动赋值的interceptor
 */
@Configuration
@ComponentScan(basePackageClasses = org.willen.sc.common.web.interceptor.AuditInterceptor.class)
public class MybatisConfig {
}
