package org.willen.sc.auth.authorization.service;

import org.springframework.stereotype.Service;
import org.willen.sc.auth.authorization.entity.Role;

import java.util.Set;

@Service
public interface IRoleService {

    Set<Role> queryUserRolesByUserId(long userId);

}
