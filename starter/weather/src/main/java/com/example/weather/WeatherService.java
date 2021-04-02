package com.example.weather;

/**
 * 提供给外部的接口
 *
 * @author mao  2021/3/15 10:45
 */
public class WeatherService {
    private WeatherSource weatherSource;

    public WeatherService(WeatherSource weatherSource) {
        this.weatherSource = weatherSource;
    }

    public String getType() {
        return weatherSource.getType();
    }

    public String getRate() {
        return weatherSource.getRate();
    }
}
