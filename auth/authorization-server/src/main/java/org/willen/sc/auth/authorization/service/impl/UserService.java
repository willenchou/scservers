package org.willen.sc.auth.authorization.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.willen.sc.auth.authorization.dao.UserMapper;
import org.willen.sc.auth.authorization.entity.User;
import org.willen.sc.auth.authorization.service.IUserService;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }
}
