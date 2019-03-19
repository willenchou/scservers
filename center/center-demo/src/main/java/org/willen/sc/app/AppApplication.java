package org.willen.sc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope
public class AppApplication {
	
	@Value("${username}")
    String userName;
	
	@Autowired
    Environment env;

    @RequestMapping("/test/config/username")
    public String testconfigusername() {
        return "client ====>>> " + userName;
    }
    
    @RequestMapping("/test/config")
    public String testconfig(String name) {
        return "client ====>>> " + env.getProperty(name, "未定义");
    }
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}

