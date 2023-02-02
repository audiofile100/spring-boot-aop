package com.aoplogging.aspect.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {

    @Pointcut("execution(* com.aoplogging.*.*.*(..))")
    public void ALL() { }

    @Pointcut("execution(* com.aoplogging.controller.*.*(..))")
    public void CONTROLLERS() { }

    @Pointcut("execution(* com.aoplogging.service.*.*(..))")
    public void SERVICES() { }
}
