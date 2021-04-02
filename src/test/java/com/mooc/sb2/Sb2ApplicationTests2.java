package com.mooc.sb2;

import com.mooc.sb2.event.WeatherRunListener;
import com.mooc.sb2.ioc.xml.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author mao  2021/3/8 5:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Sb2Application.class)
// 加载配置了bean的xml文件
@ContextConfiguration("classpath:ioc/demo.xml")
public class Sb2ApplicationTests2 {
    @Autowired
    private HelloService helloService;

    @Test
    public void contextLoads() {}


    /**
     * 测试xml注入的bean
     */
    @Test
    public void testIoc() {
        String result = helloService.hello();
        System.out.println(result);
    }
}
