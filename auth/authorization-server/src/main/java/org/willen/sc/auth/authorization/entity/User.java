package org.willen.sc.auth.authorization.entity;

import org.willen.sc.common.core.entity.po.BasePo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User extends BasePo {
    private String name;
    private String mobile;
    private String username;
    private String password;
    private Boolean enabled;
    private Boolean accountNonExpired;
    private Boolean credentialsNonExpired;
    private Boolean accountNonLocked;
}