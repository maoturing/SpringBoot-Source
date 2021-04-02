package com.mooc.sb2.ioc.ann;

import org.springframework.stereotype.Component;

/**
 * @author mao  2021/3/10 6:47
 */
@Component
public class Teacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
