package com.kangyonggan.uc.service.impl;

import com.github.ofofs.jca.annotation.Log;
import com.kangyonggan.uc.model.User;
import com.kangyonggan.uc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author kangyonggan
 * @since 8/1/18
 */
@Service
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Override
    @Log
    public User findUserByUsername(String username) {
        User user = new User();
        user.setUsername(username);
        return myMapper.selectOne(user);
    }
}
