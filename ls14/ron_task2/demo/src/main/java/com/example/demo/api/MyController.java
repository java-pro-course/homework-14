package com.example.demo.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
    @PutMapping("sum/{firstNumber}/{secondNumber}")
    public String a(@PathVariable String num1, @PathVariable String num2 ){
        return "Число 1: " + num1 + ". "+ "Число 2: " + num2 +". " +  "Результат: " + Integer.parseInt(num1) + Integer.parseInt(num2);
    }



}
