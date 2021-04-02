package com.mooc.sb2.event;

import org.springframework.stereotype.Component;

/**
 * @author mao  2021/3/8 2:16
 */
@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster{
    @Override
    protected void doStart() {
        System.out.println("==========begin boradcast weather event=======");
    }

    @Override
    protected void doEnd() {
        System.out.println("==========end boradcast weather event=======");
    }
}
