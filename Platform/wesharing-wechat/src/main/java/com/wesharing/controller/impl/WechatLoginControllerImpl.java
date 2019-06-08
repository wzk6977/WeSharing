package com.wesharing.controller.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wesharing.controller.IWechatLoginController;
import com.wesharing.model.User;
import com.wesharing.service.IUserService;
import com.wesharing.util.AesCbcUtil;
import com.wesharing.util.HttpRequest;

import net.sf.json.JSONObject;

@RestController
public class WechatLoginControllerImpl implements IWechatLoginController {
	
	@Autowired
	IUserService userService; 
	@Override
	@RequestMapping(value = "/decodeUserInfo",method = RequestMethod.GET)
	public Map decodeUserInfo(String encryptedData, String iv, String code) {
		 Map map = new HashMap();
		    //登录凭证不能为空
		    if (code == null || code.length() == 0) {
		        map.put("status", 0);
		        map.put("msg", "code 不能为空");
		        return map;
		    }

		    //小程序唯一标识   (在微信小程序管理后台获取)
		    String wxspAppid = "wx99fd23fbb03b80c9";
		    //小程序的 app secret (在微信小程序管理后台获取)
		    String wxspSecret = "2fc23c26f879ad0c5851a55714a098ff";
		    //授权（必填）
		    String grant_type = "authorization_code";


		    //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid ////////////////
		    //请求参数
		    String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;
		    //发送请求
		    String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
		    //解析相应内容（转换成json对象）
		    JSONObject json = JSONObject.fromObject(sr);
		    //JSONObject json = JSONObject.fromObject(sr);
		    //获取会话密钥（session_key）
		    String session_key = json.get("session_key").toString();
		    //用户的唯一标识（openid）
		    String openid = (String) json.get("openid");

		    //////////////// 2、对encryptedData加密数据进行AES解密 ////////////////
		    try {
		        String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
		        if (null != result && result.length() > 0) {
		            map.put("status", 1);
		            map.put("msg", "解密成功");

		            JSONObject userInfoJSON = JSONObject.fromObject(result);
		            Map userInfo = new HashMap();
		            userInfo.put("openId", userInfoJSON.get("openId"));
		            userInfo.put("nickName", userInfoJSON.get("nickName"));
		            userInfo.put("gender", userInfoJSON.get("gender"));
		            userInfo.put("city", userInfoJSON.get("city"));
		            userInfo.put("province", userInfoJSON.get("province"));
		            userInfo.put("country", userInfoJSON.get("country"));
		            userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
		            userInfo.put("unionId", userInfoJSON.get("unionId"));
		            map.put("userInfo", userInfo);
		            return map;
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    map.put("status", 0);
		    map.put("msg", "解密失败");
		    return map;
	}

	@Override
	@RequestMapping("/saveUser")
	public int saveUser(User user) {
		System.out.println("saveUser          "+user);
		return userService.saveUser(user);
	}

	@Override
	@RequestMapping("/getUserInfoById")
	public User getUserInfoById(String openId) {
		
		User user = userService.getUserInfoById(openId);
		System.out.println("getUserInfo       "+user.toString());
		System.out.println("  core = " +user.getCredit_core());
		return user;
	}

}
