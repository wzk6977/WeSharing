package com.wesharing.controller;

import java.util.Map;

import com.wesharing.model.User;

public interface IWechatLoginController {
	
//	��ȡopenId����Ϣ
	Map decodeUserInfo(String encryptedData, String iv, String code); 
	
//	�����û���Ϣ
	int saveUser(User user);
	
//	��ȡ�û���Ϣ
	User getUserInfoById(String openId);
	
}
