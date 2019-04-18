package org.willen.sc.auth.authentication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.willen.sc.auth.authentication.dao.ResourceMapper;
import org.willen.sc.auth.authentication.entity.Resource;
import org.willen.sc.auth.authentication.service.IResourceService;

import java.util.Set;

@Service
public class ResourceService implements IResourceService {
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public Set<Resource> findAll() {
        return resourceMapper.findAll();
    }

    @Override
    public Set<Resource> queryByRoleCodes(String[] roleCodes) {
        return resourceMapper.queryByRoleCodes(roleCodes);
    }
}
