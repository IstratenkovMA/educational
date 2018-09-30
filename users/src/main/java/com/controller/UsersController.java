package com.controller;

import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author miis0317
 * @date 28-09-18
 */
@Controller
@RequestMapping("/user")
public class UsersController {


    @RequestMapping("/get")
    public User getUserById(long id) {

    }
}
