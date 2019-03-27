# center
## apps

  *  config center
  	config
  * service discovery center
  	eureka
  * bus
  	bus
  * rpc -interface-balance
  		* RestTemplate&Ribbon
  		* Feign
  * rpc -系统可用安全-隔离限流熔断降级
  		* RestTmplate&Ribbon&Hystrix
  		* Feign
##deploy
	* simple docker-compose deploy
		* base:docker-compose-center.yml
			rabbitmq&config&bus&eureka （tag:center）
		* producter:docker-compose-demo.yml
			demo for config,eureka,rabbitmq(tag:center)
		* consumer: 
			* docker-compose-demo-consumer.yml:
				client demo for using http rest api  rpc with RestTemplate&Ribbon,Feign(tag:rpc-rest-balance)
			* docker-compose-demo-ribbon.yml,docker-compose-demo-feign.yml: 				client demo for using hysytrix,Feign for 隔离限流熔断降级(tag:rpc-hysytrix)
		
