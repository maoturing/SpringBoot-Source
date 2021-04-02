package com.mooc.sb2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 模拟Spring中 EventPublishingRunListener 封装广播器的操作
 *
 * @author mao  2021/3/8 5:21
 */
@Component
public class WeatherRunListener {
    @Autowired
    private WeatherEventMulticaster multicaster;

    public void rain() {
        multicaster.multicaster(new RainEvent());
    }

    public void snow() {
        multicaster.multicaster(new SnowEvent());
    }
}
