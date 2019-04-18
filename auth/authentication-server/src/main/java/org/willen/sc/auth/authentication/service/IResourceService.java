package org.willen.sc.auth.authentication.service;

import org.springframework.stereotype.Service;
import org.willen.sc.auth.authentication.entity.Resource;

import java.util.Set;

@Service
public interface IResourceService {
    /**
     * 返回所有的资源定义内容，resources表中
     *
     * @return
     */
    Set<Resource> findAll();

    /**
     * 根据角色code查询到角色把对应的资源定义
     *
     * @param roleCodes
     * @return
     */
    Set<Resource> queryByRoleCodes(String[] roleCodes);
}
