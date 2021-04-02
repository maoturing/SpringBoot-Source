package com.mooc.sb2.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * 自定义监听器, 实现ApplicationListener, 监听ApplicationStartedEvent
 * <p>
 * 在 application.properties 中配置 context.listener.classes
 * 会在框架启动调用 listener.started()后执行, 打印日志.
 * <p>
 * 通过DelegatingApplicationListener代理加载和执行onApplicationEvent()方法
 *
 * @author mao  2021/3/8 19:26
 */
@Order(3)
public class ThirdListener implements ApplicationListener<ApplicationStartedEvent> {

    /**
     * 监听的StartedEvent, 会在框架启动后调用
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("============ Spring Application Started.......thirdListener=============");
    }
}
