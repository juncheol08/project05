package com.chunjae.project05.domain;

import com.chunjae.project05.entity.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class UserPrincipal implements UserDetails {
    //UserDetails 스프링시큐리티 기본 제공 인터페이스

    private User user;

    public UserPrincipal(User user){
        this.user=user;
    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Arrays.asList(new UserGrant());
//
//    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Collection<GrantedAuthority> collectors = new ArrayList<>();
        collectors.add(new GrantedAuthority() {

            @Override
            public String getAuthority() {
                return "ROLE_" + user.getRole();
            }

        });

        return collectors;
    }





    @Override
    public String getPassword() {
        return user.getPassword();
    }

    // id?
    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getActive()==1;
    }

    public String getId() {
        return user.getLoginId();
    }
    public String getName() {
        return user.getUserName();
    }
}
