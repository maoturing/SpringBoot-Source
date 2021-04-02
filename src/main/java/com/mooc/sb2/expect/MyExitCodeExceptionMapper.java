package com.mooc.sb2.expect;

import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.boot.web.embedded.tomcat.ConnectorStartFailedException;
import org.springframework.stereotype.Component;

/**
 * 设置异常退出码
 * org.springframework.boot.SpringApplication#getExitCodeFromMappedException(org.springframework.context.ConfigurableApplicationContext, java.lang.Throwable)
 * 该方法在获取退出码时会遍历ExitCodeExceptionMapper接口的实现类, 然后调用其 getExitCode() 方法获取退出码
 *
 * @author mao  2021/3/13 3:22
 */
@Component
public class MyExitCodeExceptionMapper implements ExitCodeExceptionMapper {
    @Override
    public int getExitCode(Throwable exception) {
        if(exception instanceof ConnectorStartFailedException) {
            return 10;
        }
        return 0;
    }
}
