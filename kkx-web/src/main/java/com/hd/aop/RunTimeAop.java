package com.hd.aop;

import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


/**
 * @Author: chenwenjun
 * @Date: 2023/2/19 15:53
 * @Description: 计算程序执行时间
 */
@Component
@Aspect
public class RunTimeAop {
    @Pointcut("execution (* com.hd.common.utils.SortUtil.*(..))")
    public void test() {

    }
    @Around("test()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.getTime(TimeUnit.MILLISECONDS)+"ms");
//        System.out.println(stopWatch.getTime(TimeUnit.MICROSECONDS)+"μs");
//        System.out.println(stopWatch.getTime(TimeUnit.NANOSECONDS)+"ns");
//        System.out.println(stopWatch.getTime(TimeUnit.SECONDS)+"s");
        return result;
    }
}
