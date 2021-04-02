package com.mooc.sb2.hook;

/**
 * Runtime.getRuntime().addShutdownHook()
 * 在jvm中增加一个关闭的钩子，当jvm关闭的时候，会执行系统中已经设置的所有通过方法addShutdownHook添加的钩子，
 * 当系统执行完这些钩子后，jvm才会关闭。所以这些钩子可以在jvm关闭的时候进行内存清理、对象销毁等操作。
 * @author mao  2021/3/13 6:46
 */
public class HookDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        Thread close_jvm = new Thread(() -> System.out.println("close_jvm"));
        Runtime.getRuntime().addShutdownHook(close_jvm);
        System.out.println("world");

    }
}
