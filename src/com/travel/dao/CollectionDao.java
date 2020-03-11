package com.travel.dao;

import java.util.List;

import com.travel.pojo.Collection;

public interface CollectionDao {
	public List<Collection> getAllItems(int uid,int startpage);
	public int getCount(int uid);
	
}
