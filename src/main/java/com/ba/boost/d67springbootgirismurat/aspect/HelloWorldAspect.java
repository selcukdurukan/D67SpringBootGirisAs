package com.ba.boost.d67springbootgirismurat.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloWorldAspect {

    @Before(value = "execution(* com.ba.boost.d67springbootgirismurat.service.impl.HelloWorldServiceImpl.*(..))")
    public void toCatchFormer() {
        System.out.println("Catching Before....");
    }

    @After(value = "execution(* com.ba.boost.d67springbootgirismurat.service.impl.HelloWorldServiceImpl.*(..))")
    public void toCatchLatter() {
        System.out.println("Catching After....");
    }
}

