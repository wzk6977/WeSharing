package com.wesharing.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wesharing.controller.IBaseController;

@Controller
public class BaseControllerImpl implements IBaseController {

	@RequestMapping("/hello")
	public void hello() {
		
		System.out.print("hello world!");
		return;
		
	}

}
