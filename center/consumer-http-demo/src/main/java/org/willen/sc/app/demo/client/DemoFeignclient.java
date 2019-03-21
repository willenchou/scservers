package org.willen.sc.app.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "center-demo", decode404 = true)
@FeignClient( name = "center-demo", path = "/test", decode404 = true)
public interface DemoFeignclient {
	
	@GetMapping("/config")
    String selectconfigByName(@RequestParam String name);
	@GetMapping("/token/back")
    String gettokenback();
}
