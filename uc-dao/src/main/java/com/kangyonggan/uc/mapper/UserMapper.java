package com.kangyonggan.uc.mapper;

import com.kangyonggan.common.mybatis.MyMapper;
import com.kangyonggan.uc.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
@Mapper
public interface UserMapper extends MyMapper<User> {
}