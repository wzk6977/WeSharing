package com.wesharing.controller.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesharing.controller.IDemandContorller;
import com.wesharing.model.Demand;
import com.wesharing.service.IDemandService;

@RestController
public class DemandContorllerImpl implements IDemandContorller {
	
	@Autowired
	IDemandService demandService;

	@Override 
	@RequestMapping("/getDemandList")
	public List<Demand> getDemandList() {
		return demandService.getDemandList();
	}

	@Override
	@RequestMapping("/publishDemand")
	public int publishDemand(Demand demand) {
		String uuid = UUID.randomUUID().toString();
		demand.setUuid(uuid);
		Date date = new Date();
		String publish_time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(date);
		System.out.println(publish_time);
		demand.setPublish_time(publish_time);
		
		return demandService.publishDemand(demand);
	}

}
