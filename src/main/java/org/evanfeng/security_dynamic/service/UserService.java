package org.evanfeng.security_dynamic.service;

import org.evanfeng.security_dynamic.bean.User;
import org.evanfeng.security_dynamic.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author Evan Feng
 * @Time 4/8/2022
 * @Github https://github.com/EvanFung
 */
@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("User does not exist.");
        }
        user.setRoles(userMapper.getRolesById(user.getId()));
        return user;
    }
}
