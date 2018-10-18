package com.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dao.UserMapper;
import com.dev.pojo.User;
import com.dev.service.IUserService;

@Service(value="userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectUserById(Long id) {
		return userMapper.selectUserById(id);
	}
	@Override
	public void deleteUserById(Long id) {
		
		userMapper.deleteUserById(id);
	}
}
