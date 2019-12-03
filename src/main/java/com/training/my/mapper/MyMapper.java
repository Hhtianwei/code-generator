package com.training.my.mapper;

/**
 * @ClassName MyMapper
 * @Description TODO
 * @DATE 2019/12/2 18:38
 * @VERSION 1.0
 **/

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}