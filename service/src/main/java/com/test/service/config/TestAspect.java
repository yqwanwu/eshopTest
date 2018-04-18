package com.test.service.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

    @Pointcut("execution(public * com.test.service.controller.*.*(..))")
    public void test() {
    }

    @AfterThrowing("test()")
    public void throwss(JoinPoint jp) {
        System.out.println("我右拳打开了天，化身为龙~~~.....方法异常。。。。。");
    }

    @Around("test()")
    public Object arround(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("方法环绕");
        try {
            return proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("有异常快跑");
        }
        return "呵呵哒";
    }

}
