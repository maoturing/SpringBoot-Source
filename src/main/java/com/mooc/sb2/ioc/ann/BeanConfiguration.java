package com.mooc.sb2.ioc.ann;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 2. 在配置类中使用@Bean标记, 创建Bean
 * @author mao  2021/3/9 3:16
 */
@Configuration      // 其实也是@Component
public class BeanConfiguration {

    // 将 Animal dog = new Dog() 注入容器
    @Bean("dog")
    public Animal getDog() {
        return new Dog();
    }
}
