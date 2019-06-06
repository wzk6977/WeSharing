package com.wesharing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesharing.dao.SharedMapper;
import com.wesharing.model.Shared;
import com.wesharing.model.SharedComment;
import com.wesharing.model.SharedImage;
import com.wesharing.service.ISharedService;

@Service
public class SharedServiceImpl implements ISharedService {

	@Autowired
	SharedMapper sharedDao;
	
	public List<Shared> getSharedList() {
//		需在此计算出每个共享距离用户的距离
		return sharedDao.getSharedList();
	}

	public Shared getSharedById(String id) {
		return sharedDao.getSharedById(id);
	}
	
	public int getSharedCommentCountBySharedId(String shared_id) {
		return sharedDao.getSharedCommentCountBySharedId(shared_id);
	}

	public List<SharedComment> getSharedCommentsBySharedId(String shared_id,int start,int num) {
		return sharedDao.getSharedCommentsBySharedId(shared_id,start,num);
	}

	public int insertComment(SharedComment sharedComment) {
		
		return sharedDao.insertComment(sharedComment);
	}

	public int publishSharedWithoutImagesViodes(Shared shared) {
		return sharedDao.publishSharedWithoutImagesViodes(shared);
	}

	public int publishSharedWithImage(SharedImage sharedImage) {
		return sharedDao.publishSharedWithImage(sharedImage);
	}
	
//	上传文件使用FastDFS轻量级分布式文件系统，现暂时不用
	

	

}
