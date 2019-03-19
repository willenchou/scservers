package org.willen.sc.bus.client.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.willen.sc.bus.client.mq.SenderDefault;

@RestController
public class TestController {
	
	
	@Autowired
	SenderDefault mqsender;
	
	@RequestMapping("/test/mq/send")
	public String testmqsend() {
		String context = "hello rabbitmq !" + new Date();
		mqsender.sender(context);
	    return "client sender ====>> " + context ;
	}
	
	

}
