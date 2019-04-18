package org.willen.sc.auth.authorization.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.willen.sc.auth.authorization.entity.Role;

import java.util.Set;

@Mapper
@Repository
public interface RoleMapper {

    @Select("SELECT DISTINCT r.code,r.name,r.description" +
            " FROM  users_roles_relation urr" +
            " INNER JOIN roles r ON r.id = urr.role_id" +
            " WHERE urr.user_id = #{userId}")
    Set<Role> queryByUserId(long userId);
}