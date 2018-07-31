package com.kangyonggan.uc;

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

    @GetMapping("test")
    public String test() {
        return "success";
    }

}
