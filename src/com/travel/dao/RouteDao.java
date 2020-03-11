package com.travel.dao;

import java.sql.Date;

public interface RouteDao {
public  int findRid(String rname);
public int find(int rid,int uid);
public void add(int rid,String date,int uid);
public void update(int rid);
public void nocollect(int rid,int uid);
/*public int addCollection();
public int deleteCollection(int rid);*/
}
