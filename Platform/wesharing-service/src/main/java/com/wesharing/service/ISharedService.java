package com.wesharing.service;

import java.util.List;

import com.wesharing.model.Shared;
import com.wesharing.model.SharedComment;
import com.wesharing.model.SharedImage;

public interface ISharedService {

//	获取共享列表
	List<Shared> getSharedList();
	
//	根据id获取共享详情
	Shared getSharedById(String id);
	
//	根据shared_id获取评论总数
	int getSharedCommentCountBySharedId(String shared_id);
	
//	根据shared_id获取评论列表
	List<SharedComment> getSharedCommentsBySharedId(String shared_id,int start,int num);
	
//  新增评论
	int insertComment(SharedComment sharedComment);
	
//	发布共享（标题、详细内容、价格、价格单位、位置）
	int publishSharedWithoutImagesViodes(Shared shared);
	
//	发布共享（图片）
	int publishSharedWithImage(SharedImage sharedImage);
	
	
}
