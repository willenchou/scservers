package org.willen.sc.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.willen.sc.app.demo.client.DemoFeignclient;

@RestController
public class FeignDemoController {
	@Autowired
    private DemoFeignclient feignClient;

    
    
    @RequestMapping("/test/feign")
    public String testconfigrpcByFeign(String name) {
    	
    	return "Feign get username  <<==>>  "+feignClient.selectconfigByName(name);
        
    }
    
    @RequestMapping("/test/feign/interceptor")
    public String testFeigninterceptor() {
    	
    	return "Feign get token  <<==>>  "+feignClient.gettokenback();
        
    }

}
