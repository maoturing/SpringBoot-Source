package com.mooc.sb2.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义系统初始化器
 * 在 application.properties 中配置context.initializer.classes
 * 通过DelegatingApplicationContextInitializer代理加载和执行initialize()方法
 *
 * @author mao  2021/3/6 4:33
 */
@Slf4j
@Order(3)
public class ThirdInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();

        // 1. 自定义配置
        Map<String, Object> map = new HashMap<>();
        map.put("key3", "value3");
        MapPropertySource mapPropertySource = new MapPropertySource("thirdInitializer", map);

        // 将自定义配置属性加入环境变量
        environment.getPropertySources().addLast(mapPropertySource);

        log.info("================ run thirdInitializer...=============");
    }
}
