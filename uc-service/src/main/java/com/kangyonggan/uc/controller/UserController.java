package com.kangyonggan.uc.controller;

import com.kangyonggan.uc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
@RestController
@RequestMapping("uc")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test(String username) {
        userService.findUserByUsername(username);
        return "success";
    }

}
