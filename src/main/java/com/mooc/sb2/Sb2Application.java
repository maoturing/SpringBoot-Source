package com.mooc.sb2;

import com.mooc.sb2.expect.Solid;
import com.mooc.sb2.initializer.SecondInitializer;
import com.mooc.sb2.ioc.ann.Dog;
import com.mooc.sb2.ioc.ann.Worker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@SpringBootApplication
@MapperScan("com.mooc.sb2.mapper")
public class Sb2Application {
    // 测试bean无法注入的情况
//    @Autowired
//    private Solid solid;

    public static void main(String[] args) throws InterruptedException {
        // 打印有色文本
//        System.out.println("\u001B[32m hello world!");
        SpringApplication.run(Sb2Application.class, args);
    }
}
