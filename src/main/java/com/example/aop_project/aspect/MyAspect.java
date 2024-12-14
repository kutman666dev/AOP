package com.example.aop_project.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.example.aop_project.service.MyService.login(..))")
    public void beforeLogin() {
        System.out.println("[BEFORE] About to call login");
    }

    @After("execution(* com.example.aop_project.service.MyService.login(..))")
    public void afterLogin() {
        System.out.println("[AFTER] login method executed");
    }

    @Around("execution(* com.example.aop_project.service.MyService.calculateSum(..))")
    public Object aroundCalculateSum(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[AROUND] Before calculateSum");
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        System.out.println("[AROUND] After calculateSum");
        System.out.println("Execution time: " + (endTime - startTime) + "ms");
        return result;
    }
}
