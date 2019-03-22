package org.willen.sc.app.demo.client.fallback;

import org.springframework.stereotype.Component;
import org.willen.sc.app.demo.client.DemoFeignclient;

@Component
public class DemoFallbackFeign implements DemoFeignclient {

	@Override
	public String selectconfigByName(String name) {
		// TODO Auto-generated method stub
		return "FeignFallbackName";
	}

	@Override
	public String gettokenback() {
		// TODO Auto-generated method stub
		return "FeignFallbackToken";
	}
	

}
