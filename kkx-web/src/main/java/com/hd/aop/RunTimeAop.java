package com.hd.aop;

import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


/**
 * @author: chenwenjun
 * @date: 2023/2/19 15:53
 * @description: TODO
 */
@Component
@Aspect
public class RunTimeAop {
    @Pointcut("execution (* com.hd.common.utils.SortUtil.*(..))")
    public void test() {

    }
    @Around("test()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        stopWatch.stop();
        System.out.println(stopWatch.getTime(TimeUnit.MILLISECONDS)+"ms");
//        System.out.println(stopWatch.getTime(TimeUnit.MICROSECONDS)+"μs");
//        System.out.println(stopWatch.getTime(TimeUnit.NANOSECONDS)+"ns");
//        System.out.println(stopWatch.getTime(TimeUnit.SECONDS)+"s");
    }
}
