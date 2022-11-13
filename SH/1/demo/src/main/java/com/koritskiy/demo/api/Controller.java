package com.koritskiy.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/name")
    public String name(){
        return "Svarog916 Мубаракшин Камиль";
    }

}
