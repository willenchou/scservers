package org.willen.sc.auth.authorization.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.willen.sc.auth.authorization.dao.RoleMapper;
import org.willen.sc.auth.authorization.entity.Role;
import org.willen.sc.auth.authorization.service.IRoleService;

import java.util.Set;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Set<Role> queryUserRolesByUserId(long userId) {
        return roleMapper.queryByUserId(userId);
    }

}
