package com.sss.lol.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWController {
    @GetMapping("name")
    public String getGitName(){
        return "MaryamSSS - Сайханова Марьям";
    }
}
