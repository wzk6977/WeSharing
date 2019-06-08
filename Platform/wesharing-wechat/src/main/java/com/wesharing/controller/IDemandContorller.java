package com.wesharing.controller;

import java.util.List;

import com.wesharing.model.Demand;

public interface IDemandContorller {
	
//	获取需求列表
	List<Demand> getDemandList();
	
//	发布需求
	int publishDemand(Demand demand);

}
