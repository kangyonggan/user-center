package com.kangyonggan.uc.plugin;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.SqlServerMapper;
import tk.mybatis.mapper.common.base.BaseDeleteMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;
import tk.mybatis.mapper.common.base.BaseUpdateMapper;

/**
 * 其他的Mapper继承MyMapper后，单表的curd不用写sql
 *
 * @author kangyonggan
 * @since 5/4/18
 */
public interface MyMapper<T> extends
        BaseSelectMapper<T>,
        BaseUpdateMapper<T>,
        BaseDeleteMapper<T>,
        ExampleMapper<T>,
        ConditionMapper<T>,
        SqlServerMapper<T> {
}
