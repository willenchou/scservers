package org.willen.sc.bus.client.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
	@Bean
    public Queue testhelloQueue() {
        return new Queue("testhello");
    }

}
