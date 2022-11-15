package com.kalamya.task1.api;

import com.kalamya.task1.object.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @GetMapping("namex")
    public User getNickNameSurname(){
    User user = new User("Mark" , "Voronchihin",  "Kalamya");
     return  user;
    }


}
