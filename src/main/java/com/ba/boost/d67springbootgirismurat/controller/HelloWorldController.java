package com.ba.boost.d67springbootgirismurat.controller;

import com.ba.boost.d67springbootgirismurat.service.IHelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private final IHelloWorldService helloWorldService;

    /**
     * localhost:8080/Hello/get
     * @return
     */

    @GetMapping("/get")
    public String sayHello() {
        return "Hello";
    }

    /**
     * localhost:8080/hello/post
     * @param value
     * @return
     */

    @PostMapping("/post")
    public String sayHello(@RequestBody String value) {
        return helloWorldService.sayHello(value);
    }

    /**
     * GET ->
     * POST -> Body'den gelen istekler için kullanılır.
     * PUT -> update için kullanılır + olarak id alır.
     * DELETE -> silme işlemi için + olarak id alır.
     */
}
