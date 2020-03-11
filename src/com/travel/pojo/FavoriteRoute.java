package com.travel.pojo;

public class FavoriteRoute {
	private int rid;//线路id，必输
	private String rname;//线路名称，必输
	private double price;//价格，必输
	private String rimage;//缩略图
    private int count;//收藏数量
    
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

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getRimage() {
		return rimage;
	}
	public void setRimage(String rimage) {
		this.rimage = rimage;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "FavoriteRoute [rid=" + rid + ", rname=" + rname + ", price=" + price + ", rimage=" + rimage + ", count="
				+ count + "]";
	}
}
