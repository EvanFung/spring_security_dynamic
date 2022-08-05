package org.evanfeng.security_dynamic;

import org.evanfeng.security_dynamic.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityDynamicApplicationTests {

    @Autowired
    MenuService menuService;
    @Test
    void contextLoads() {
        System.out.println(menuService.getAllMenus());
    }

    @Test
    void testGetAllMenu() {
        System.out.println(menuService.getAllMenus());
    }

}
