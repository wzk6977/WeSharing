package com.wesharing.dao;

import java.util.List;

import com.wesharing.model.Demand;

public interface DemandMapper {
	
//	��ȡ�����б�
	List<Demand> getDemandList();  
	
//	��������
	int publishDemand(Demand demand);

}
