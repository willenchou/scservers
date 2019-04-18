package org.willen.sc.auth.authorization.entity;

import org.willen.sc.common.core.entity.po.BasePo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Role extends BasePo {
    private String code;
    private String name;
    private String description;
}
