package com.mooc.sb2.event;

import org.springframework.web.multipart.MultipartFile;

/**
 * 广播器
 *
 * @author mao  2021/3/8 2:11
 */
public interface EventMulticaster {
    // 广播事件
    void multicaster(WeatherEvent event);

    // 添加天气监听器
    void addListener(WeatherListener listener);

    // 移除天气监听器
    void removeListener(WeatherListener listener);
}
