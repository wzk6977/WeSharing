package com.wesharing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesharing.dao.DemandMapper;
import com.wesharing.model.Demand;
import com.wesharing.service.IDemandService;

@Service
public class DemandServiceImpl implements IDemandService {
	
	@Autowired
	DemandMapper demandDao; 

	public List<Demand> getDemandList() {
		return demandDao.getDemandList();
	}

	public int publishDemand(Demand demand) {
		return demandDao.publishDemand(demand);
	}

}
