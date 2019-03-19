package org.willen.sc.bus.client.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者Receiver 使用@RabbitListener注解定义该类对hello队列的监听, 并用@RabbitHandler 注解来指定对消息的处理方法
 *
 */
@Component
@RabbitListener(queues = "testhello")
public class ReceiverDefault {
	private final Logger logger = LoggerFactory.getLogger(ReceiverDefault.class);

    @RabbitHandler
    public void receiver(String hello){
        logger.info("接收消息=====》》》》》{}",hello);
    }
}
