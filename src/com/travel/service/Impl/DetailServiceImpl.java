package com.travel.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.travel.dao.Impl.DetailDaoImpl;
import com.travel.pojo.Category;
import com.travel.pojo.Route;
import com.travel.pojo.RouteImg;
import com.travel.pojo.Seller;
import com.travel.service.DetailService;

public class DetailServiceImpl implements DetailService{
	DetailDaoImpl dd=new DetailDaoImpl();
	
	
	public Route detailservice(int id){	
		Route route=dd.findroutDetail(id) ;
		List<RouteImg> list =dd.findrouteImgDetail(id);
		route.setRouteImgList(changeimages(list));
		Seller seller=dd.findSellerDetail(id);
		route.setSeller(seller);
		Category cat=dd.fincategory(id);
		route.setCategory(cat);
		return route;
	}
	
	public static List<RouteImg> changeimages(List<RouteImg> list){
		List<RouteImg> list1=new ArrayList<RouteImg>();
		//�ж�ͼƬ������������������Ϊ4
		if(list.size()<4){
			int i=list.size();
			switch (i) {
			case 0:
				break;
			case 1:
				list1.add(list.get(0));
				list1.add(list.get(0));
				list1.add(list.get(0));
				list1.add(list.get(0));
				break;
			case 2:
				list1.add(list.get(0));
				list1.add(list.get(1));
				list1.add(list.get(0));
				list1.add(list.get(0));
				break;
			case 3:
				list1.add(list.get(0));
				list1.add(list.get(1));
				list1.add(list.get(2));
				list1.add(list.get(0));
				break;
			default:
				break;
			}
			
		}else{
			list1.add(list.get(0));
			list1.add(list.get(1));
			list1.add(list.get(2));
			list1.add(list.get(3));
		}
		//System.out.println(list1);;
		return list1;
	}
}
