package com.sss.lol.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWController {
    @GetMapping("name")
    public String getGitName(){
        return "MaryamSSS - Сайханова Марьям";
    }

    @GetMapping("sum/{firstNumber}/{secondNumber}")
    public String sum(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber);
    }
}
