package com.mooc.sb2.event;

/**
 * @author mao  2021/3/8 2:18
 */
public class Test {
    public static void main(String[] args) {
        // 1. 创建广播器
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();

        // 2. 创建监听器监听广播
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);

        // 3. 广播下雨事件RainEvent，所有监听器都会收到, 并执行响应操作
        eventMulticaster.multicaster(new RainEvent());
        eventMulticaster.multicaster(new SnowEvent());

        // 4. 移除下雨监听器, 广播下雨事件RainEvent, RainListener监听器不会有反应
        eventMulticaster.removeListener(rainListener);
        eventMulticaster.multicaster(new RainEvent());
        eventMulticaster.multicaster(new SnowEvent());
    }
}
