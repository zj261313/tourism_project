package com.travel.dao;

import java.util.List;

import com.travel.pojo.Category;
import com.travel.pojo.Route;
import com.travel.pojo.RouteImg;
import com.travel.pojo.Seller;

public interface DetailDao{
	public Route findroutDetail(int id);
	public List<RouteImg> findrouteImgDetail(int id);
	public Seller findSellerDetail(int id);
	public Category fincategory(int id);
}
