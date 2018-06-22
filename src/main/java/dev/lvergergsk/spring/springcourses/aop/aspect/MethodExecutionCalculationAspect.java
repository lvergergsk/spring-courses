package dev.lvergergsk.spring.springcourses.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Around("dev.lvergergsk.spring.springcourses.aop.aspect.CommonJointPointConfig.trackTimeAnnotation()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        LOGGER.info("Time taken by {} is {} milliseconds", proceedingJoinPoint, timeTaken);

    }
}
