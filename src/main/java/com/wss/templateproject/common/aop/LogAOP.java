package com.wss.templateproject.common.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @创建人 songtx
 * @创建时间 2019-05-16 22:40
 * @描述 日志信息处理AOP
 */
@Order(-100)
@Component
@Aspect
@Slf4j
public class LogAOP {
}
