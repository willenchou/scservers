package org.willen.sc.app.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class RibbonRestTemplateConfiguration {
	

	    @Bean
	    public IRule ribbonRule() {
	        return new RandomRule();
	    }
	 
        @LoadBalanced
        @Bean
        RestTemplate restTemplate() {
            return new RestTemplate();
        }	    

}
