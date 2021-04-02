package com.mooc.sb2.ioc.ann;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactory后置处理器, 在BeanFactory初始化完成后调用
 *
 * 实现BeanFactoryPostProcessor来设置bean的属性值
 *
 * 注意和BeanDefinitionRegistryPostProcessor区分
 *
 * @author mao  2021/3/10 6:48
 */
@Component
public class MyBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
    /**
     * 用来设置bean的属性值
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // 从容器中获取bean
        // teacher 已经通过@Component注入到beanFactory中
        BeanDefinition teacher = beanFactory.getBeanDefinition("teacher");

        MutablePropertyValues propertyValues = teacher.getPropertyValues();
        // 设置teacher实例的name属性为"wangwu"
        propertyValues.addPropertyValue("name", "wangwu");
    }
}
