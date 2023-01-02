package org.charlie.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Charlie-6327
 * @date 2022/12/25
 */

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* org.charlie.controller.AccountBalanceController.*(..))")
    public void pointcut() {}

    @Around("pointcut()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        System.out.println("执行耗时： " + (System.currentTimeMillis() - start));
        return proceed;
    }
}
