package com.kalamya.task2.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class sumController {
    @GetMapping("{num1}/{num2}")
 public int a(@PathVariable String num1, @PathVariable String num2 ){
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
    }


