package com.wesharing.service;

import java.util.List;

import com.wesharing.model.User;

public interface IUserService {
	
//	保存用户信息
	int saveUser(User user);
	
//	获取用户信息
	List<User> getUserInfo();
	
	User getUserInfoById(String openId);
}
