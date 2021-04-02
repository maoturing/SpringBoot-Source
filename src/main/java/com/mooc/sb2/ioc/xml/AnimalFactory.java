package com.mooc.sb2.ioc.xml;

/**
 * @author mao  2021/3/9 0:19
 */
public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        } else if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        return null;
    }
}
