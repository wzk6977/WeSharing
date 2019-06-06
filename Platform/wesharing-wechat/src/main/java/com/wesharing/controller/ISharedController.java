package com.wesharing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.wesharing.model.Shared;
import com.wesharing.model.SharedComment;
import com.wesharing.model.SharedImage;

public interface ISharedController {

//	获取共享列表
	List<Shared> getSharedList();
	
//	根据Id获取共享详情
	Shared getSharedById(String id);
	
//	根据shared_id获取评论
	int getSharedCommentCountBySharedId(String shared_id);
	
//	根据shared_id获取评论列表
	List<SharedComment> getSharedCommentsBySharedId(String shared_id,int start,int num);
	
//  新增评论
	int insertComment(SharedComment sharedComment);
	
	
//	发布共享（标题、详细内容、价格、价格单位、位置）
	String publishSharedWithoutImagesViodes(Shared shared);
	
//	发布共享(图片)
	int publishSharedWithImages(HttpServletRequest request,MultipartFile file,SharedImage sharedImage);
	
//	发布共享(视频)
	int publishSharedWithVideos(HttpServletRequest request,MultipartFile file);
}
