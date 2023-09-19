package com.ba.boost.d67springbootgirismurat.service.impl;

import com.ba.boost.d67springbootgirismurat.exception.GlobalException;
import com.ba.boost.d67springbootgirismurat.service.IHelloWorldService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements IHelloWorldService {
    @Override
    public String sayHello(String value) {
        System.out.println("Hello " + value);

//        if (1==1)
//            throw new GlobalException("Boom!", HttpStatus.BAD_REQUEST);

        return "Hello " + value;
    }
}
