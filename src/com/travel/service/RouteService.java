package com.travel.service;

import java.sql.Date;

public interface RouteService {
public boolean isCollection(int rid,int uid);
public void collection(int rid,String date,int uid);
}
