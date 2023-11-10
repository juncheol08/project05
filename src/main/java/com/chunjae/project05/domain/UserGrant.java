package com.chunjae.project05.domain;

import org.springframework.security.core.GrantedAuthority;

public class UserGrant implements GrantedAuthority {
    //GrantedAuthority 관리자 권한 인터페이스

    @Override
    public String getAuthority() {
//        return "ROLE_USER";
        return "ADMIN";
    }
}
