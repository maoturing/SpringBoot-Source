package com.mooc.sb2.startup.pros;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author mao  2021/3/10 2:49
 */
@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware {
    private Environment env;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("mooc.url: " + env.getProperty("mooc.url"));
//        System.out.println("mooc.path: " + env.getProperty("mooc.path"));
//        System.out.println("mooc.vm.name: " + env.getProperty("mooc.vm.name"));

        System.out.println("mooc.profile: " + env.getProperty("mooc.profile"));
    }


    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }
}
