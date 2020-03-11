package com.travel.pojo;

import java.util.List;

public class RouteListPageContent {
	private int routeCount;
	private int pageSum;
//	private Page p;
	private List<RouteListPage> list;
	
	public int getRouteCount() {
		return routeCount;
	}
	public void setRouteCount(int routeCount) {
		this.routeCount = routeCount;
	}
	public int getPageSum() {
		return pageSum;
	}
	public void setPageSum(int pageSum) {
		this.pageSum = pageSum;
	}
	
	
	public List<RouteListPage> getList() {
		return list;
	}
	public void setList(List<RouteListPage> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "PageContent [routeCount=" + routeCount + ", pageSum=" + pageSum + ", list=" + list + "]";
	}
	
	
	
	
	

}
