package com.kangyonggan.uc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "world") String name) {
        return "hello " + name;
    }

}
