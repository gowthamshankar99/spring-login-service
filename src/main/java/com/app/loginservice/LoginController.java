package com.app.loginservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ecommerce")
public class LoginController {
    
    @RequestMapping(value = "/login/user", method= RequestMethod.GET)
    public String userLogin() {
        return "returning data from user function";
    }
}
