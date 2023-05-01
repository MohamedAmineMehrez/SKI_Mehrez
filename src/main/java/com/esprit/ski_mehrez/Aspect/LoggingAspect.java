package com.esprit.ski_mehrez.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @Before("execution(public * com.esprit.ski_mehrez.Services.*.*(..))")
    public void In_Method(JoinPoint in){
        log.info("IN-Method"+in.getSignature().getName());
    }
    @AfterReturning("execution(public * com.esprit.ski_mehrez.Services.*.*(..))")
    public void Out_Method(JoinPoint out){
        log.info("OUT-Method"+out.getSignature().getName());
    }
}
