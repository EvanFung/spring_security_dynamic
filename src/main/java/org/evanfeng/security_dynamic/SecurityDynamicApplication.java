package org.evanfeng.security_dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@MapperScan("org.evanfeng.security_dynamic.mapper")
public class SecurityDynamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDynamicApplication.class, args);
    }

}
