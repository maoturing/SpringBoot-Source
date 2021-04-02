package com.mooc.sb2;

import com.mooc.sb2.event.WeatherRunListener;
import com.mooc.sb2.ioc.ann.HelloService;
import com.mooc.sb2.ioc.ann.MyBeanImport;
import com.mooc.sb2.ioc.ann.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author mao  2021/3/8 5:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Sb2Application.class)
@Import(MyBeanImport.class)     //
public class Sb2ApplicationTests {

    @Autowired
    private WeatherRunListener weatherRunListener;

    // 当类HelloService使用了@Component注解后这里不报红了
    @Autowired
    private HelloService helloService;

    @Autowired
    private Teacher teacher;

    @Test
    public void contextLoads() {}

    /**
     * 发布事件
     */
    @Test
    public void testEvent() {
        weatherRunListener.rain();
        weatherRunListener.snow();
    }

    /**
     * 测试注解注入的bean
     */
    @Test
    public void testIoc() {
        String result = helloService.hello();
        System.out.println(result);
    }

    @Test
    public void testName() {
        System.out.println(teacher.getName());
    }

}
