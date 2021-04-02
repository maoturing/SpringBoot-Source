package com.mooc.sb2.ioc.ann;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 3. 实现 FactoryBean 接口, 创建Bean
 * @author mao  2021/3/9 3:26
 */

@Component
public class MyCat implements FactoryBean<Animal> {

    @Override
    public Animal getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
}
