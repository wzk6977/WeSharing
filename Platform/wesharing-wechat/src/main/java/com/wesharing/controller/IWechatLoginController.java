package com.wesharing.controller;

import java.util.Map;

import com.wesharing.model.User;

public interface IWechatLoginController {
	
//	获取openId等信息
	Map decodeUserInfo(String encryptedData, String iv, String code); 
	
//	保存用户信息
	int saveUser(User user);
	
//	获取用户信息
	User getUserInfoById(String openId);
	
}
