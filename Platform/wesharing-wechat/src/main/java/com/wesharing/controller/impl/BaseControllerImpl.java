package com.wesharing.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wesharing.controller.IBaseController;
import com.wesharing.model.Student;

@RestController
public class BaseControllerImpl implements IBaseController {

	@RequestMapping("/hello")
	@ResponseBody
	public Student hello() {
		Student stu = new Student();
		stu.setAge(10);
		stu.setName("hello");
		System.out.print("hello world!");
	
		return stu;
		
	}

}
