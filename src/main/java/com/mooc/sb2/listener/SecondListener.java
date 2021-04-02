package com.mooc.sb2.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * 自定义监听器, 实现ApplicationListener, 监听ApplicationStartedEvent
 *
 * 在 Sb2Application2.main()方法中手动添加该监听器
 * 会在框架启动调用 listener.started()后执行, 打印日志.
 *
 * @author mao  2021/3/8 19:26
 */
@Order(2)
public class SecondListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("============ Spring Application Started.......SecondListener=============");
    }
}
