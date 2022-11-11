package com.elizaveta.example.api;

import com.elizaveta.example.sum.UserSum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("sum/{firstNumber}/{secondNumber}")
    public UserSum  getSum(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber){
        UserSum sum = new UserSum(firstNumber, secondNumber);
        return  sum;
    }

}
