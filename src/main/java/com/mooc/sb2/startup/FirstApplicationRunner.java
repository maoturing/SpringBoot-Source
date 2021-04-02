package com.mooc.sb2.startup;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 自定义启动加载器
 * 运行时需要添加程序参数 --name=mao
 * @author mao  2021/3/9 23:23
 */
@Order(1)
@Component
public class FirstApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        String option = "[name=" + args.getOptionValues("name").get(0) + "]";
//        System.out.println("\u001B[32m  >>> start first application runner <<< " + option);
    }
}
