package com.wesharing.service;

import java.util.List;

import com.wesharing.model.Shared;
import com.wesharing.model.SharedComment;
import com.wesharing.model.SharedImage;

public interface ISharedService {

//	��ȡ�����б�
	List<Shared> getSharedList();
	
//	����id��ȡ��������
	Shared getSharedById(String id);
	
//	����shared_id��ȡ��������
	int getSharedCommentCountBySharedId(String shared_id);
	
//	����shared_id��ȡ�����б�
	List<SharedComment> getSharedCommentsBySharedId(String shared_id,int start,int num);
	
//  ��������
	int insertComment(SharedComment sharedComment);
	
//	�����������⡢��ϸ���ݡ��۸񡢼۸�λ��λ�ã�
	int publishSharedWithoutImagesViodes(Shared shared);
	
//	��������ͼƬ��
	int publishSharedWithImage(SharedImage sharedImage);
	
	
}
