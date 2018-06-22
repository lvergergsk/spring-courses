package dev.lvergergsk.spring.springcourses.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Aspect is combination of pointcut and advice.
// framework to intercept a join point is called weaver, the process is called weaving.
@Aspect
@Configuration
public class UserAccessAspect {
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

//    Pointcut expressions:
//    @Before("execution(* dev.lvergergsk.spring.springcourses.aop.business.*.*(..))")
//    @Before("execution(* dev.lvergergsk.spring.springcourses.aop..*.*(..))")
    @Before("dev.lvergergsk.spring.springcourses.aop.aspect.CommonJointPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {
//        Advice:
        LOGGER.info("Check for user access.");
        LOGGER.info("Allow execution for - {}",joinPoint);
    }
}
