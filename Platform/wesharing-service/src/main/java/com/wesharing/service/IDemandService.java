package com.wesharing.service;

import java.util.List;

import com.wesharing.model.Demand;

public interface IDemandService {
	
//	��ȡ�����б�
	List<Demand> getDemandList();
	
//	��������
	int publishDemand(Demand demand);

}
