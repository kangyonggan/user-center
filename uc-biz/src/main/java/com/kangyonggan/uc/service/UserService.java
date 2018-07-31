package com.kangyonggan.uc.service;

import com.kangyonggan.uc.model.User;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
public interface UserService {

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    User findUserByUsername(String username);
}
