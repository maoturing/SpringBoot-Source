package com.mooc.sb2.condi;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author mao  2021/3/15 9:43
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(MyCondition.class)
public @interface MyConditional {

    String[] value() default {};
}
