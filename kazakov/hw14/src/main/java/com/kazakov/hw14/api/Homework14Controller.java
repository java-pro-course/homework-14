package com.kazakov.hw14.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homework14Controller {

    @GetMapping
    public String sayHello() {
        return "It's my first API!!!";
    }

    @GetMapping("name")
    public String tellMeCodemika() {
        return "chewedmole - Kazakov Roman";
    }

}
