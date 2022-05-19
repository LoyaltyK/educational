package com.example.educational.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserLoginController {

    @PostMapping("/login")
    @ResponseBody
    public String login(int userId, String passWord){
        return "login";
    }

}
