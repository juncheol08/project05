package com.chunjae.project05.biz;


import com.chunjae.project05.domain.UserPrincipal;
import com.chunjae.project05.entity.Role;
import com.chunjae.project05.entity.User;
import com.chunjae.project05.entity.UserRole;
import com.chunjae.project05.persis.RoleMapper;
import com.chunjae.project05.persis.UserMapper;
import com.chunjae.project05.persis.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User findUserByLoginId(String loginId){
        return userMapper.findUserByLoginId(loginId);
    }


    //
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        userMapper.setUserInfo(user);
        Role role = roleMapper.getRoleInfo("USER");
        System.out.println("role : "+role.toString());
        UserRole userRole = new UserRole();
        User chkUser = userMapper.findUserByLoginId(user.getLoginId());
        userRole.setRoleId(role.getId());
        userRole.setUserId(chkUser.getId()); // 0
        userRoleMapper.setUserRoleInfo(userRole);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.findUserByLoginId(username);
        System.out.println(user.toString()+" /  "+username);

        //권한부여


        return new UserPrincipal(user);
    }
}
