package com.travel.pojo;

import java.util.List;

public class BigCollection {
private int pageCount;     //总页数
private List<Collection> listcount;   //对象集合，每12页为一个对象
public int getPageCount() {
	return pageCount;
}
public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}
public List<Collection> getListcount() {
	return listcount;
}
public void setListcount(List<Collection> listcount) {
	this.listcount = listcount;
}
@Override
public String toString() {
	return "BigCollection [pageCount=" + pageCount + ", listcount=" + listcount + "]";
}


}
