package com.zyj.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClssName EduApplication
 * @Description todo
 * @Author zyj
 * @Date 29/3/2022 下午 10:11
 * @Version 1.0
 **/

@SpringBootApplication
@ComponentScan(basePackages = {"com.zyj"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }
}
