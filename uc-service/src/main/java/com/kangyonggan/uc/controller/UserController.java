package com.kangyonggan.uc.controller;

import com.kangyonggan.common.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
@RestController
@RequestMapping("uc")
public class UserController {

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    @GetMapping("{username:[\\w]+}")
    public Response findUserByUsername(@PathVariable("username") String username) {
        Response response = Response.getSuccessResponse();
        return response;
    }

}
