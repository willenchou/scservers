package org.willen.sc.gateway.admin.entity.param;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

import org.willen.sc.common.core.entity.param.BaseParam;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GatewayRouteQueryParam extends BaseParam {
    public GatewayRouteQueryParam(String uri) {
        this.uri = uri;
    }
    private String uri;
    private Date createdTimeStart;
    private Date createdTimeEnd;
}
