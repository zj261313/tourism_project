package com.travel.pojo;

import java.util.List;

public class FavoriteCount {
	
	private int pageCount;//�ܹ�����ҳ
	private List<FavoriteRoute> favoriteRoutelist;//������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺�
	
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
