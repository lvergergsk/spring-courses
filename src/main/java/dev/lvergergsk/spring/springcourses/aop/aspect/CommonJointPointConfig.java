package dev.lvergergsk.spring.springcourses.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {
    @Pointcut("execution(* dev.lvergergsk.spring.springcourses.aop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* dev.lvergergsk.spring.springcourses.aop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("dataLayerExecution() && businessLayerExecution()")
    public void allLayerExecution() {
    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {
    }

    @Pointcut("@annotation(dev.lvergergsk.spring.springcourses.aop.aspect.TrackTime)")
    public void trackTimeAnnotation() {
    }

}
