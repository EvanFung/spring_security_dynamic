package org.evanfeng.security_dynamic.service;

import org.evanfeng.security_dynamic.bean.Menu;
import org.evanfeng.security_dynamic.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Evan Feng
 * @Time 5/8/2022
 * @Github https://github.com/EvanFung
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
