# scservers
##说明
##目录结构
* common
	基础架包，封装操作，提供工具类
* center
	微服务基础功能中心应用：配置中心，服务注册发现中心，bus中心
* gateway
	应用网关
* auth
	授权鉴权服务（后续可将服务可扩展到用户中心+开放平台中心的服务，在common中提供安全架包供用户中心，开放平台中心集成）
	
## 部署
1. base app:docker-compose-thrid.yml<-docker-compose-center.yml<-docker-compose-demo-[gateway].yml.  		
2. gateway app:docker-compose-demo-auth.yml<-docker-compose-demo-gateway.yml.   		 
3. demo app:demo-provider.yml<-demo-consumer.yml
		