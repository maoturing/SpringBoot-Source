package com.mooc.sb2.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 自定义启动加载器
 * @author mao  2021/3/9 22:41
 */
@Component
@Order(2)
public class SecondCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\u001B[32m  >>> start second runner <<<");
    }
}
