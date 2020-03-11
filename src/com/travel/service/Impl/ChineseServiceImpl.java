package com.travel.service.Impl;

import java.util.List;

import com.travel.dao.Impl.ChineseDaoImpl;
import com.travel.pojo.Route;
import com.travel.service.ChineseService;

public class ChineseServiceImpl implements ChineseService{
	
	public List<Route> popularrouteservice(){
		List<Route> mostpopularlist = new ChineseDaoImpl().findPopularroutbydesc();
		return mostpopularlist;
	}
	
	public List<Route> newestrouteservice(){
		List<Route> newestlist = new ChineseDaoImpl().findnewestlistbydesc();
		return newestlist;
	}
	
	public List<Route> themerouteservice(){
		List<Route> themelist = new ChineseDaoImpl().findthemelistbydesc();
		//System.out.println(themelist);
		return themelist;
	}
}
