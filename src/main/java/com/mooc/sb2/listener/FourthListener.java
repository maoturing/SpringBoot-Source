package com.mooc.sb2.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * 自定义监听器, 实现SmartApplicationListener接口, 通过supportsEventType()判断是否监听了某个事件Event
 * 这种类似SpringBoot中的监听器实现
 *
 * 想要加载到spring容器需要在 spring.factories中配置
 * 会在框架启动调用 listener.started()后执行, 打印日志.
 *
 * @author mao  2021/3/8 19:26
 */
@Order(4)
public class FourthListener implements SmartApplicationListener {

    /**
     * 判断监听器是否监听了事件eventType
     * 当前监听器只监听ApplicationStartedEvent
     * @param eventType
     * @return
     */
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        // 如果事件是ApplicationStartedEvent, 或是其子类, 则返回true
        return ApplicationStartedEvent.class.isAssignableFrom(eventType);
    }

    /**
     * 监听到了指定 event, 执行相应操作
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("============ Spring Application Started.......FourthListener=============");
    }
}
