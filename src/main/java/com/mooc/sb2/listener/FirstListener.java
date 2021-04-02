package com.mooc.sb2.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * 自定义监听器, 实现ApplicationListener, 监听ApplicationStartedEvent
 *
 * 想要加载到spring容器需要在 spring.factories中配置
 * 会在框架启动调用 listener.started()后执行, 打印日志.
 *
 * @author mao  2021/3/8 19:26
 */
@Order(2)
public class FirstListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("============ Spring Application Started.......FirstListener=============");
    }
}
