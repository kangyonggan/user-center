package com.kangyonggan.uc.controller;

import com.kangyonggan.common.Response;
import com.kangyonggan.uc.model.User;
import com.kangyonggan.uc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
@RestController
@RequestMapping("uc")
public class UserController {

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
        User user = userService.findUserByUsername(username);

        response.put("user", user);
        return response;
    }

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    @PostMapping
    public Response saveUser(User user) {
        userService.saveUser(user);

        return Response.getSuccessResponse();
    }

}
