package com.travel.service;

import java.util.List;
import com.travel.pojo.Route;

public interface ChineseService {
	public List<Route> popularrouteservice();
	public List<Route> newestrouteservice();
	public List<Route> themerouteservice();
}
