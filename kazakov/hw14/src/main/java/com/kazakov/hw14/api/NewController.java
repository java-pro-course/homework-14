package com.kazakov.hw14.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("/sum/{firstNumber}/{secondNumber}")
    @ResponseBody
    public int getSum(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return firstNumber + secondNumber;
    }
}
