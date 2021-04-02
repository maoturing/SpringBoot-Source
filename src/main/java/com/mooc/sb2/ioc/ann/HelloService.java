package com.mooc.sb2.ioc.ann;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 1. 通过@Component创建Bean
 *
 * @author mao  2021/3/8 23:59
 */
@Component      // 加入到容器
public class HelloService {

    // 当使用了BeanConfiguration @Bean注解后, 这里不报红了
    @Autowired
    @Qualifier("dog")
    // 当创建了MyCat之后, 存在多个 Animal Bean, 需要指定
    //  @Qualifier("myCat")

    // 当创建了MyBeanRegister之后, 存在多个Animal Bean, 需要指定
    //    @Qualifier("monkey")

    // 当创建了MyBeanImport, 存在多个Animal Bean, 需要指定
    //    @Qualifier("bird")
    private Animal animal;

    public String hello() {

        return "hello" + animal.getName();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
