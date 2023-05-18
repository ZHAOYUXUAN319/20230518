package com.bilibili.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bilibili.entity.User;

@Mapper
//dbと関係
public interface UserMapper {
//インタフェースのメソッド（接口的方法）
	User getUser(String username);
}
