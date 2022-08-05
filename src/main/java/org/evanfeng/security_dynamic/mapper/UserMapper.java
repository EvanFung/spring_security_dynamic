package org.evanfeng.security_dynamic.mapper;

import org.evanfeng.security_dynamic.bean.Role;
import org.evanfeng.security_dynamic.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Evan Feng
 * @Time 4/8/2022
 * @Github https://github.com/EvanFung
 */
public interface UserMapper {
    List<Role> getRolesById(Integer id);

    User loadUserByUsername(String username);
}
