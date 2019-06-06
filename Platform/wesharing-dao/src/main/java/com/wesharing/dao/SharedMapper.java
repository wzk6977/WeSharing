package com.wesharing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wesharing.model.Shared;
import com.wesharing.model.SharedComment;
import com.wesharing.model.SharedImage;

public interface SharedMapper{
	
//	��ȡ�����б�
	List<Shared> getSharedList();
	
//	����id��ȡ��������
	Shared getSharedById(String id);
	
//	����shared_id��ȡ��������
	int getSharedCommentCountBySharedId(String shared_id);
	
//	����shared_id��ȡ�����б�
	List<SharedComment> getSharedCommentsBySharedId(@Param(value = "shared_id") String shared_id,@Param(value = "start")int start,@Param(value = "num") int num);
	
//	����shared_id��user_id��������
	int insertComment(SharedComment sharedComment);
	
//	�����������⡢��ϸ���ݡ��۸񡢼۸�λ��λ�ã�
	int publishSharedWithoutImagesViodes(Shared shared);
	
//	��������ͼƬ��
	int publishSharedWithoutImage(SharedImage sharedImage);

	int publishSharedWithImage(SharedImage sharedImage);
	
}
