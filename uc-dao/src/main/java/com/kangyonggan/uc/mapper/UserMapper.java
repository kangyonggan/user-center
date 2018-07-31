package com.kangyonggan.uc.mapper;


import com.kangyonggan.uc.model.User;
import com.kangyonggan.uc.plugin.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kangyonggan
 * @since 5/4/18
 */
@Mapper
public interface UserMapper extends MyMapper<User> {
    /**
     * 插入用户角色
     *
     * @param username
     * @param roleCodes
     */
    void insertUserRoles(@Param("username") String username, @Param("roleCodes") List<String> roleCodes);
}