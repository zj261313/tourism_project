package com.travel.pojo;

public class Collection {
private int rid;  //线路id
private String rname;//线路名称
private int price;   //价格
private String rimage;//图片路径

public Collection(){
}

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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getRimage() {
	return rimage;
}
public void setRimage(String rimage) {
	this.rimage = rimage;
}
@Override
public String toString() {
	return "Collection [rid=" + rid + ", rname=" + rname + ", price=" + price + ", rimage=" + rimage + "]";
}


}
