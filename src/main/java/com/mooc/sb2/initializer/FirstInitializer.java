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
 * 自定义初始化器
 * 想要加载到spring容器需要在 spring.factories中配置
 *
 * @author mao  2021/3/6 4:33
 */
@Slf4j
@Order(1)
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();

        // 1. 自定义配置
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        MapPropertySource mapPropertySource = new MapPropertySource("firstInitializer", map);

        // 将自定义配置属性加入环境变量
        environment.getPropertySources().addLast(mapPropertySource);

        // 项目启动必须要有 mooc 属性, 否则无法启动
        // environment.setRequiredProperties("mooc");

        log.info("================ run firstInitializer...=============");
    }
}
