package com.mooc.sb2.event;

import org.springframework.stereotype.Component;

/**
 * 监听器, 监听天气事件WeatherEvent
 * @author mao  2021/3/8 2:07
 */
@Component
public class SnowListener implements WeatherListener{

    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent) {
            System.out.println(event.getWeather() + "穿暖和点!");
        }
    }
}
