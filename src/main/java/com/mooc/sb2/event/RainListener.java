package com.mooc.sb2.event;

import org.springframework.stereotype.Component;

/**
 * @author mao  2021/3/8 2:07
 */
@Component
public class RainListener implements WeatherListener{
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println(event.getWeather() + "记得带伞!");
        }
    }
}
