package com.wesharing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.wesharing.model.Shared;
import com.wesharing.model.SharedComment;
import com.wesharing.model.SharedImage;

public interface ISharedController {

//	��ȡ�����б�
	List<Shared> getSharedList();
	
//	����Id��ȡ��������
	Shared getSharedById(String id);
	
//	����shared_id��ȡ����
	int getSharedCommentCountBySharedId(String shared_id);
	
//	����shared_id��ȡ�����б�
	List<SharedComment> getSharedCommentsBySharedId(String shared_id,int start,int num);
	
//  ��������
	int insertComment(SharedComment sharedComment);
	
	
//	�����������⡢��ϸ���ݡ��۸񡢼۸�λ��λ�ã�
	String publishSharedWithoutImagesViodes(Shared shared);
	
//	��������(ͼƬ)
	int publishSharedWithImages(HttpServletRequest request,MultipartFile file,SharedImage sharedImage);
	
//	��������(��Ƶ)
	int publishSharedWithVideos(HttpServletRequest request,MultipartFile file);
}
