package com.mooc.sb2.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author mao  2021/3/6 4:40
 */
@Service
public class TestService implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    /**
     * 谁来调用这个方法来设置 ApplicationContext ?
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 获取环境变量 key1
     * @return
     */
    public String getProperty() {
        return applicationContext.getEnvironment().getProperty("key1");
    }
}
