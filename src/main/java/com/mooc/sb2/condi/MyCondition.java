package com.mooc.sb2.condi;

import org.apache.logging.log4j.util.Strings;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * 自定义Condition
 * @author mao  2021/3/15 9:42
 */

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取@MyConditional的属性value
        Map<String, Object> attributes = metadata.getAnnotationAttributes("com.mooc.sb2.condi.MyConditional");
        String[] properties = (String[]) attributes.get("value");

        // 遍历value数组, 如果不为空, 则说明该属性存在, 返回true
        for (String property : properties) {
            if (StringUtils.isEmpty(context.getEnvironment().getProperty(property))) {
                return false;
            }
        }
        return true;
    }
}
