package com.mooc.sb2.ioc.ann;


import org.springframework.stereotype.Component;

/**
 * @author mao  2021/3/9 0:18
 */
public class Cat extends Animal {
    @Override
    String getName() {
        return "Cat";
    }
}
