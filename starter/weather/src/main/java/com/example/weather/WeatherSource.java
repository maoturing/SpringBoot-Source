package com.example.weather;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author mao  2021/3/15 10:44
 */
@ConfigurationProperties(prefix = "weather")
public class WeatherSource {
    private String type;
    private String rate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
