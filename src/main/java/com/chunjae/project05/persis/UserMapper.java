package com.chunjae.project05.persis;

import com.chunjae.project05.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    User findUserByLoginId(@Param("loginId") String loginId);
    int setUserInfo(@Param("param") User param);

}
