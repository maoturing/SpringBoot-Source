package com.mooc.sb2.ioc.xml;

/**
 * @author mao  2021/3/9 0:19
 */
public class AnimalFactory2 {
    /**
     * 实例（对象）方法创建对象， 而非静态方法
     * @param type
     * @return
     */
    public  Animal getAnimal(String type) {
        if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        } else if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        return null;
    }
}
