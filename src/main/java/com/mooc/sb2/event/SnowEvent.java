package com.mooc.sb2.event;

/**
 * @author mao  2021/3/8 2:06
 */
public class SnowEvent extends WeatherEvent{
    @Override
    public String getWeather() {
        return "snow...";
    }
}
