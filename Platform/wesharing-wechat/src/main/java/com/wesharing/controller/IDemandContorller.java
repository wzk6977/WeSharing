package com.wesharing.controller;

import java.util.List;

import com.wesharing.model.Demand;

public interface IDemandContorller {
	
//	��ȡ�����б�
	List<Demand> getDemandList();
	
//	��������
	int publishDemand(Demand demand);

}
