package com.wesharing.service;

import java.util.List;

import com.wesharing.model.User;

public interface IUserService {
	
//	�����û���Ϣ
	int saveUser(User user);
	
//	��ȡ�û���Ϣ
	List<User> getUserInfo();
	
	User getUserInfoById(String openId);
}
