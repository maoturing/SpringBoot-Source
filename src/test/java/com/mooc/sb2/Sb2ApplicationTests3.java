package com.mooc.sb2;

import com.mooc.sb2.condi.MoocCondi;
import com.mooc.sb2.ioc.xml.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author mao  2021/3/8 5:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Sb2Application.class)
public class Sb2ApplicationTests3 implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 测试@ConditionalProperty注解
     *
     * 必须配置 com.mooc.condition 属性, 才能创建bean
     */
    @Test
    public void testCondi() {
        System.out.println(applicationContext.getBean(MoocCondi.class));;
    }
}
