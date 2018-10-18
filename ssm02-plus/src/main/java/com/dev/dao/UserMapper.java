package com.dev.dao;

import org.apache.ibatis.annotations.Param;

import com.dev.pojo.User;

public interface UserMapper {
	
	public User selectUserById(@Param("id") Long id);

	public void deleteUserById(@Param("id") Long id);
}
