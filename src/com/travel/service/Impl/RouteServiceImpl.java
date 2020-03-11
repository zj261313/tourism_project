package com.travel.service.Impl;

import java.sql.Date;

import com.travel.dao.Impl.RouteDaoImpl;
import com.travel.service.RouteService;

public class RouteServiceImpl implements RouteService {
    private RouteDaoImpl dao=new RouteDaoImpl();

	@Override
	public boolean isCollection(int rid, int uid) {
		int len = dao.find(rid, uid);
		if(len>0){
			return true;
			
		}else{
		return false;
		}
	}

	@Override
	public void collection(int rid,String date, int uid) {
          dao.add(rid, date, uid);
	
	}
		
	
	

}
