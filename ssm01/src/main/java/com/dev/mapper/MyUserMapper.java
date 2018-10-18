package com.dev.mapper;

import com.dev.pojo.MyUser;
import org.apache.ibatis.annotations.Param;


public interface MyUserMapper {
	
	public MyUser selectUserById(@Param("id") Long id);
}
