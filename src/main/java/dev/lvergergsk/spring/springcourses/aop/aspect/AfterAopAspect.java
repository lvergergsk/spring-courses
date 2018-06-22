package dev.lvergergsk.spring.springcourses.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    @AfterReturning(value = "dev.lvergergsk.spring.springcourses.aop.aspect.CommonJointPointConfig.businessLayerExecution()",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        LOGGER.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value = "dev.lvergergsk.spring.springcourses.aop.aspect.CommonJointPointConfig.businessLayerExecution()",
            throwing = "exception", argNames = "joinPoint,exception")
    public void afterThrowing(JoinPoint joinPoint, Object exception) {
        LOGGER.info("{} throws exception {}", joinPoint, exception);
    }

    @After(value = "dev.lvergergsk.spring.springcourses.aop.aspect.CommonJointPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint) {
        LOGGER.info("After execution of {}", joinPoint);
    }
}
