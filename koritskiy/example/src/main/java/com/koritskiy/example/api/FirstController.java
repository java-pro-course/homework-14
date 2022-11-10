package com.koritskiy.example.api;

import com.koritskiy.example.objects.UserObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // аннотация, которая сообщает спринг-буту, что здесь будут API
public class FirstController {

    @GetMapping // определяем HTTP-метод и URL
    public String sayHello() {
        return "Hello, world!";
    }

    @GetMapping("codemika") // определяем HTTP-метод и URL
    public String tellMeCodemika() {
        return "Codemika. Java Pro!";
    }

    @GetMapping("user")
    public UserObject getUser() {
        UserObject user = new UserObject("Alexander", "Koritskiy", 21);
        return user;
    }
}
