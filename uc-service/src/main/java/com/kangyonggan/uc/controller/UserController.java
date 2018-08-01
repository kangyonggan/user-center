package com.kangyonggan.uc.controller;

import com.kangyonggan.common.Response;
import com.kangyonggan.common.web.BaseController;
import com.kangyonggan.uc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    @GetMapping("{username:[\\w]+}")
    public Response findUserByUsername(@PathVariable("username") String username) {
        Response response = Response.getSuccessResponse();
        response.put("user", userService.findUserByUsername(username));
        return response;
    }

}
