package org.willen.sc.gateway.admin.service;

import java.util.List;

import org.willen.sc.gateway.admin.entity.param.GatewayRouteQueryParam;
import org.willen.sc.gateway.admin.entity.po.GatewayRoute;

public interface IGatewayRouteService {
    /**
     * 获取网关路由
     *
     * @param id
     * @return
     */
    GatewayRoute get(long id);

    /**
     * 新增网关路由
     *
     * @param gatewayRoute
     * @return
     */
    long add(GatewayRoute gatewayRoute);

    /**
     * 查询网关路由
     *
     * @return
     */
    List<GatewayRoute> query(GatewayRouteQueryParam gatewayRouteQueryParam);

    /**
     * 更新网关路由信息
     *
     * @param gatewayRoute
     */
    void update(GatewayRoute gatewayRoute);

    /**
     * 根据id删除网关路由
     *
     * @param id
     */
    void delete(long id);

    /**
     * 重新加载网关路由配置到redis
     * @return 成功返回true
     */
    boolean overload();
}
