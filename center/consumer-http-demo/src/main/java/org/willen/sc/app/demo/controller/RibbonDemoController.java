package org.willen.sc.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.willen.sc.app.config.RibbonRestTemplateConfiguration;



@RestController
//@RibbonClient(name = "center-ribbon-Rule",configuration = RibbonRestTemplateConfiguration.class)
@RefreshScope
public class RibbonDemoController {
	@Value("${username}")
    String userName;
	
	@Autowired
    Environment env;
	
	@Autowired
	private  RestTemplate restTemplate;
	
	//@Autowired
    //private  DiscoveryClient discoveryClient;
	
	@RequestMapping("/test/config/username")
    public String testconfigusername() {
        return "client ====>>> " + userName;
    }
    
    /*******************Ribbon*************************/
    
    @RequestMapping("/test/ribbon")
    public String testconfigrpc(String name) {
    	
    	return "RestTemplate+Ribbon get username  <<==>>  "+restTemplate.getForObject("http://center-demo/test/config/username",String.class);
        
    }

}
