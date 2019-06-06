package com.wesharing.controller.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wesharing.controller.ISharedController;
import com.wesharing.model.Shared;
import com.wesharing.model.SharedComment;
import com.wesharing.model.SharedImage;
import com.wesharing.service.ISharedService;

@RestController
public class SharedControllerImpl implements ISharedController {

	@Autowired
	ISharedService sharedService;
	
	@Override
	@RequestMapping("/getSharedList")
	public List<Shared> getSharedList() {
		return sharedService.getSharedList();
	}

	@Override
	@RequestMapping("/getSharedById")
	public Shared getSharedById(String id) {
		return sharedService.getSharedById(id);
	}
	
	@Override
	@RequestMapping("/getSharedCommentCountBySharedId")
	public int getSharedCommentCountBySharedId(String shared_id) {
		return sharedService.getSharedCommentCountBySharedId(shared_id);
	}


	@Override
	@RequestMapping("/getSharedCommentsBySharedId")
	public List<SharedComment> getSharedCommentsBySharedId(String shared_id,int start,int num) {
		
		System.out.println(shared_id   +"   "+start+"    "+num);
		return sharedService.getSharedCommentsBySharedId(shared_id,start,num);
	}

	@Override
	@RequestMapping("/insertComment")
	public int insertComment(SharedComment sharedComment) {
		Random r = new Random(100);
		String uuid = r.toString();
		sharedComment.setUuid(uuid);
		return sharedService.insertComment(sharedComment);
	}

	@Override
	@RequestMapping("/publishSharedWithoutImagesVideos")
	public String publishSharedWithoutImagesViodes(Shared shared) {
		
		String uuid = UUID.randomUUID().toString();
		shared.setUuid(uuid);
		Date date = new Date();
		String publish_time = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss").format(date);
		shared.setPublish_time(publish_time);
		int succ = sharedService.publishSharedWithoutImagesViodes(shared);
		if(succ > 0) {
			return uuid;
		}else {
			return "fail";
		}
	}
	
	@Override
	@RequestMapping("/publishSharedWithImages")
	public int publishSharedWithImages(HttpServletRequest request,MultipartFile pictureFile,SharedImage sharedImage) {
		System.out.println("--------------------"+pictureFile.getName());
		
		//使用UUID给图片重命名，并去掉四个“-”
				String name = UUID.randomUUID().toString().replaceAll("-", "");
				//获取文件的扩展名
				String ext = FilenameUtils.getExtension(pictureFile.getOriginalFilename());
				//设置图片上传路径
				String url = request.getSession().getServletContext().getRealPath("/upload");
				System.out.println(url);
				String image_url = url+"/"+name + "." + ext;
				//以绝对路径保存重名命后的图片
				try {
					pictureFile.transferTo(new File(image_url));
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
					return 0;
				}
				
				sharedImage.setUuid(name);
				sharedImage.setImage_url(image_url);
				System.out.println(sharedImage);
				
				return sharedService.publishSharedWithImage(sharedImage);
		
	}

	@Override
	@RequestMapping("/publishSharedWithVideos")
	public int publishSharedWithVideos(HttpServletRequest request, MultipartFile file) {
		return 0;
	}
	
	
}
