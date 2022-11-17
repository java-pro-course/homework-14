package com.company.exapmle.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping("sum/{firstNumber}/{secondNumber}")
    @ResponseBody
    public int Sum(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return firstNumber + secondNumber;
    }

}
