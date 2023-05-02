package com.esprit.ski_mehrez.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
@Aspect
@Component
@Slf4j
public class PerfomanceAspect {
    @Around("execution(public *  com.esprit.ski_mehrez.Services.*.add* (..))")
    public Object ExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object o = pjp.proceed();

        stopWatch.stop();
        log.info("execution time of{} is {}",pjp.getSignature().getName() , stopWatch.getTotalTimeMillis() );

        return o;


        //ye7Sebli temps de reponse mte3 kol methode tetlansa
    }
}
