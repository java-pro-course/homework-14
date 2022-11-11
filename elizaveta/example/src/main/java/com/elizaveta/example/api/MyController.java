package com.elizaveta.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public String sayGit(){
        return "login: ugodina-elizaveta, name: Ugodina Elizaveta :)";
    }

}
