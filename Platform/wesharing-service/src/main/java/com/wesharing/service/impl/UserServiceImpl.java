package com.wesharing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesharing.dao.UserMapper;
import com.wesharing.model.User;
import com.wesharing.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper userDao;

	public int saveUser(User user) {
		
		User myUser = userDao.getUserInfoById(user.getUuid());
		
		try {
		
		if(myUser == null) {
			userDao.saveUser(user);
		}
		else {
			userDao.updateUser(user);
		}
		}catch(Exception e) {
			return 0;
		}
		
		return 1;
	}

	public User getUserInfoById(String openId) {
		return userDao.getUserInfoById(openId);
	}

	public List<User> getUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
