package com.mooc.sb2.controller;

import com.example.weather.WeatherService;
import com.mooc.sb2.bean.Demo;
import com.mooc.sb2.service.DemoService;
import com.mooc.sb2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author mao  2021/3/6 2:29
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private TestService testService;

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable Integer id) {
        return Optional.ofNullable(demoService.getDemoById(id))
                .map(Demo::toString).orElse("empty String");
    }

    @GetMapping("/test")
    public String testInitializer() {
        return testService.getProperty();
    }

    @GetMapping("/weather")
    public String weather() {
        return weatherService.getType() + ", " + weatherService.getRate();
    }
}
