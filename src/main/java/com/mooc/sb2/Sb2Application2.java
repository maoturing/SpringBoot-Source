package com.mooc.sb2;

import com.mooc.sb2.initializer.SecondInitializer;
import com.mooc.sb2.listener.SecondListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.util.Properties;

//@SpringBootApplication        // 单元测试时需要注释, 否则找到两个@SpringBootConfiguration
@PropertySource({"demo.properties"})
@MapperScan("com.mooc.sb2.mapper")
public class Sb2Application2 {

    public static void main(String[] args) {
        // SpringApplication.run(Sb2Application.class, args);

        // 自定义Spring应用
        SpringApplication springApplication = new SpringApplication(Sb2Application2.class);
        // 添加初始化器
        springApplication.addInitializers(new SecondInitializer());
        // 添加监听器
        springApplication.addListeners(new SecondListener());

        // 添加备选banner, 当我们没有设置banner.txt和banner.jpg时生效
//        springApplication.setBanner(new ResourceBanner(new ClassPathResource("banner_bak.txt")));

        // 设置默认属性
        Properties properties = new Properties();
        properties.setProperty("mooc.url", "www.baidu.com");
        springApplication.setDefaultProperties(properties);

        springApplication.run(args);
    }
}
