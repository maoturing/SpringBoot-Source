package com.mooc.sb2.event;

/**
 * 事件RainEvent
 * @author mao  2021/3/8 2:06
 */
public class RainEvent extends WeatherEvent{
    @Override
    public String getWeather() {
        return "rain...";
    }
}
