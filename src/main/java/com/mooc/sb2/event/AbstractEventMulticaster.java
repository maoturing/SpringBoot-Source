package com.mooc.sb2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mao  2021/3/8 2:13
 */
@Component
public abstract class AbstractEventMulticaster implements EventMulticaster {

    //    private List<WeatherListener> listenerList = new LinkedList<>();

    @Autowired
    private List<WeatherListener> listenerList;

    /**
     * 对每个监听器发送事件, 其实就是让每个监听器执行响应
     * @param event
     */
    @Override
    public void multicaster(WeatherEvent event) {
        doStart();
        // 对每个监听器广播事件
        listenerList.forEach(listener -> listener.onWeatherEvent(event));

        doEnd();
    }


    protected abstract void doStart();

    protected abstract void doEnd();


    @Override
    public void addListener(WeatherListener listener) {
        listenerList.add(listener);
    }

    @Override
    public void removeListener(WeatherListener listener) {
        listenerList.remove(listener);
    }
}
