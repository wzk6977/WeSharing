package com.wesharing.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wesharing.model.User;



public interface UserMapper {
	
//	�����û���Ϣ
	int saveUser(User user);
	
//	��ȡ�û���Ϣ
	User getUserInfoById(String openId);
	
	
	List<User> getUserInfo();
	
	void updateUser(User user);

}
