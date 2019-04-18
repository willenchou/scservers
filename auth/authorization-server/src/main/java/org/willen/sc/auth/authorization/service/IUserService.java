package org.willen.sc.auth.authorization.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.willen.sc.auth.authorization.entity.User;

@Service
public interface IUserService {

    @Cacheable(value = "#id")
    User getByUsername(String username);
}
