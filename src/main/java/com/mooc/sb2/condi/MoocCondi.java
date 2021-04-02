package com.mooc.sb2.condi;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author mao  2021/3/15 9:15
 */
@Component
//@ConditionalOnProperty("mooc.condition")
@MyConditional("mooc.condition.my")
public class MoocCondi {
}
