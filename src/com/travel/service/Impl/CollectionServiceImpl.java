package com.travel.service.Impl;

import com.travel.dao.Impl.CollectionDaoIpml;
import com.travel.pojo.BigCollection;
import com.travel.service.CollectionService;

public class CollectionServiceImpl implements CollectionService {

	@Override
	
	//用big对象类型   传入uid  当前页currentpage
	public BigCollection find(int uid,int currentpage) {//从哪一页开始
		CollectionDaoIpml dao=new CollectionDaoIpml();
		BigCollection bigcollection=new BigCollection();
		
		int count ;  //总的条数
		int pagecount;//总页数
		int startpage;//哪一页开始
		
		count=dao.getCount(uid);
		if(count%12==0){
			pagecount=count/12;   //总页数
		}else{
			pagecount=count/12+1;
		}
		
		if(currentpage==1){
			
			startpage=0;
		}else{
			startpage=(currentpage-1)*12;
		}
		bigcollection.setPageCount(pagecount);
		
		bigcollection.setListcount(dao.getAllItems(uid, startpage));
		
		/*
		 *  count = findcount（）//返回一个int类型  在dao层
		 *  if（count%12==0）{
		 *  pagecount = count/12    ///总页数
		 *  }else{
		 *   pagecount = （int）（count/12）+1  
		 *  }
		 * 
		 * big  b  =new big（）；
		 * 
		 * b.setlist(查询返回的list  在dao层)
		 * 
		 * b.setpagecount(pagecount);
		 * 
		 * 
		 * return  big对象
		 * 
		 * */
		 /*big   list<coll>  =  查询返回的list  在dao层*/

		
		
		return bigcollection;
	}

}
