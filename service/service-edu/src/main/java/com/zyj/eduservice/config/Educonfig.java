package com.zyj.eduservice.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClssName Educonfig
 * @Description todo
 * @Author zyj
 * @Date 29/3/2022 下午 10:16
 * @Version 1.0
 **/

@Configuration
@MapperScan("com.zyj.eduservice.mapper")
public class Educonfig {
    /**
     * 逻辑删除插件
     */
    @Bean
    public ISqlInjector sqlInjector(){
        return new LogicSqlInjector();
    }


}
