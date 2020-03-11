package com.travel.dao;

import java.util.List;

import com.travel.pojo.Route;

public interface ChineseDao {
	public List<Route> findPopularroutbydesc();
	public List<Route> findnewestlistbydesc();
	public List<Route> findthemelistbydesc();
}
