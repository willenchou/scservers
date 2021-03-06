package org.willen.sc.gateway.admin.entity.ov;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.willen.sc.common.core.entity.vo.BaseVo;
import org.willen.sc.gateway.admin.entity.po.FilterDefinition;
import org.willen.sc.gateway.admin.entity.po.GatewayRoute;
import org.willen.sc.gateway.admin.entity.po.PredicateDefinition;

@EqualsAndHashCode(callSuper = true)
@Data
@Slf4j
public class GatewayRouteVo extends BaseVo {
    private Long id;
    private String uri;
    private Integer order;
    private List<FilterDefinition> filters = new ArrayList<>();
    private List<PredicateDefinition> predicates = new ArrayList<>();

    public GatewayRouteVo(GatewayRoute gatewayRoute) {
        this.id = gatewayRoute.getId();
        this.uri = gatewayRoute.getUri();
        this.order = gatewayRoute.getOrders();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.filters = objectMapper.readValue(gatewayRoute.getFilters(), new TypeReference<List<FilterDefinition>>() {
            });
            this.predicates = objectMapper.readValue(gatewayRoute.getPredicates(), new TypeReference<List<PredicateDefinition>>() {
            });
        } catch (IOException e) {
            log.error("网关路由对象转换失败", e);
        }
    }
}
