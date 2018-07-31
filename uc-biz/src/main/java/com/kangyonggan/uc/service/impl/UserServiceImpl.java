package com.kangyonggan.uc.service.impl;

import com.github.ofofs.jca.annotation.Log;
import com.kangyonggan.common.Status;
import com.kangyonggan.uc.model.User;
import com.kangyonggan.uc.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
@Service
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Override
    @Log
    public void saveUser(User user) {
        myMapper.insertSelective(user);
    }

    @Override
    @Log
    public User findUserByUsername(String username) {
        if (username == null) {
            return null;
        }
        User user = new User();
        user.setUsername(username);
        user.setStatus(Status.ENABLE.getCode());
        return myMapper.selectOne(user);
    }
}
