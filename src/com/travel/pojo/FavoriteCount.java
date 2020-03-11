package com.travel.pojo;

import java.util.List;

public class FavoriteCount {
	
	private int pageCount;//总共多少页
	private List<FavoriteRoute> favoriteRoutelist;//包含查询到的收藏多的路线的信息的对象集合
	
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<FavoriteRoute> getFavoriteRoutelist() {
		return favoriteRoutelist;
	}
	public void setFavoriteRoutelist(List<FavoriteRoute> favoriteRoutelist) {
		this.favoriteRoutelist = favoriteRoutelist;
	}
	@Override
	public String toString() {
		return "FavoriteCount [pageCount=" + pageCount + ", favoriteRoutelist=" + favoriteRoutelist + "]";
	}
	
}
