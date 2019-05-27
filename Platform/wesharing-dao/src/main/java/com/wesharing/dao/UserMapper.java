package com.wesharing.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wesharing.model.User;



public interface UserMapper {
	
//	保存用户信息
	int saveUser(User user);
	
//	获取用户信息
	User getUserInfoById(String openId);
	
	
	List<User> getUserInfo();
	
	void updateUser(User user);

}
