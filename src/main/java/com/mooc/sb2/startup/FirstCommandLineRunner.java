package com.mooc.sb2.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 自定义启动加载器
 * 运行时需要添加程序参数 --name=mao
 * @author mao  2021/3/9 22:41
 */
@Component
@Order(1)
public class FirstCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
//        String option = "[args: " + args[0] + "]";
//        System.out.println("\u001B[32m  >>> start first runner <<< " + option);
    }
}
