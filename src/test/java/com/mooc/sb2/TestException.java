package com.mooc.sb2;

import com.mooc.sb2.expect.AException;
import com.mooc.sb2.expect.BException;
import com.mooc.sb2.expect.CException;

/**
 * 测试层层包装的异常
 * @author mao  2021/3/13 2:55
 */
public class TestException {
    public static void main(String[] args) {
        try {
            throw new CException(new BException(new AException(new Exception("test"))));
        } catch (Throwable t) {
            while (t != null) {
                System.out.println(t.getClass());
                t = t.getCause();
            }
        }
    }
}
