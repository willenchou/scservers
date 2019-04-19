package org.willen.sc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
//@EnableHystrixDashboard
//@ComponentScan(basePackages = {"com.dai.*"})
public class AppApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}

