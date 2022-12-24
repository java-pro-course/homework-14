package com.kalamya.task1.api;

import com.kalamya.task1.object.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @GetMapping("name")
    public User getNickNameSurname(){
        User user = new User("Mark" , "Voronchihin",  "Kalamya");
        return  user;
    }
    @GetMapping("{GitHubNickname}/{realName}/{realSurname}")
    public String getNickNameSurnameUrl(@PathVariable String GitHubNickname, @PathVariable String realName, @PathVariable String realSurname ){
        return GitHubNickname + ": " + realName + " " + realSurname;
    }


}