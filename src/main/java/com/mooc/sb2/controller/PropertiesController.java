package com.mooc.sb2.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mao  2021/3/10 2:53
 */
//@RestController       // 无法注入Environment
public class PropertiesController {

    @GetMapping("/pros/{key}")
    public String getProperty(Environment environment, @PathVariable String key){
        String value = environment.getProperty(key);
        return key + "->" + value;
    }
}
