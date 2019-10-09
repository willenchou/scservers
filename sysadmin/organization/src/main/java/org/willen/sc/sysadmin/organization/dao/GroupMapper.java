package org.willen.sc.sysadmin.organization.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.willen.sc.sysadmin.organization.entity.po.Group;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupMapper extends BaseMapper<Group> {
}