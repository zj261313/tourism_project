package com.travel.pojo;

public class RouteListPage {
	private int rid;//详情页id
	private String rname;//线路名称，必输
	private double price;//价格，必输
	private String routeIntroduce;//线路介绍
	private String rimage;//缩略图
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRouteIntroduce() {
		return routeIntroduce;
	}
	public void setRouteIntroduce(String routeIntroduce) {
		this.routeIntroduce = routeIntroduce;
	}
	public String getRimage() {
		return rimage;
	}
	public void setRimage(String rimage) {
		this.rimage = rimage;
	}
	@Override
	public String toString() {
		return "Page [rid=" + rid + ", rname=" + rname + ", price=" + price + ", routeIntroduce=" + routeIntroduce
				+ ", rimage=" + rimage + "]";
	}
	
	
	 
}
