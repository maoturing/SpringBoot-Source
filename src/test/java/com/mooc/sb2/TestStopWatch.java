package com.mooc.sb2;

import org.springframework.util.StopWatch;

/**
 * 计时器使用演示
 *
 * @author mao  2021/3/9 22:40
 */
public class TestStopWatch {
    public static void main(String[] args) throws InterruptedException {
        StopWatch myWatch = new StopWatch("mywatch");
        // 启动task1
        myWatch.start("task1");
        Thread.sleep(1000L);
        // 保存当前任务到taskList, 计算totalTimeMillis, 自增taskCount
        myWatch.stop();

        // 启动task2
        myWatch.start("task2");
        Thread.sleep(2000L);
        myWatch.stop();

        int i = 1 / 0;
        myWatch.start("task3");
        Thread.sleep(3000L);
        myWatch.stop();

        System.out.println(myWatch.prettyPrint());
    }
}
