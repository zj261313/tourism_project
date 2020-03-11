package com.travel.service.Impl;

import java.util.List;

import com.travel.dao.Impl.DomesticAndForeignDaoImpl;
import com.travel.pojo.Route;
import com.travel.service.DomesticAndForeignservice;

public class DomesticAndForeignserviceImpl implements DomesticAndForeignservice {
	public List<Route> domesticservice(){
		DomesticAndForeignDaoImpl df=new DomesticAndForeignDaoImpl();
		List<Route> list =df.finddomesticroute();
		return list;
	};
	public List<Route> foreignservice(){
		DomesticAndForeignDaoImpl df=new DomesticAndForeignDaoImpl();
		List<Route> list =df.findforeignroute();
	//	System.out.println(list);
		return list;
	};
}
