package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Capstore;
import com.cg.dao.RevenueDao;

@Service
@Transactional
public class RevenueServiceImpl implements RevenueService {
	
	@Autowired RevenueDao revenueDao;
	
	public void updateCapStoreRevenue(Double total) {
		
		
		
		revenueDao.updateCapStoreRevenue(total);
		
	}

}
