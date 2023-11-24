package com.tsherpa.project05.per;

import com.tsherpa.project05.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface RoleMapper {

    Role getRoleInfo(@Param("role") String role);

}