package com.example.demo.api;

import com.example.demo.object.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
    @GetMapping("name")
    public User Name(){
        User u= new User("Ron6_6", "Рон", "Мартыненко");
        return u;
    }
    @GetMapping("{nick}/{name}/{name2")
    public String Name(@PathVariable String nick, @PathVariable String name, @PathVariable String name2){
        return nick + name + name2;
}
}
