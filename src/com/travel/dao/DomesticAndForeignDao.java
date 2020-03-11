package com.travel.dao;

import java.util.List;

import com.travel.pojo.Route;

public interface DomesticAndForeignDao {
	public List<Route> finddomesticroute();
	public List<Route> findforeignroute();
}
