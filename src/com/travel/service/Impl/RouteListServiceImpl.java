package com.travel.service.Impl;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.travel.dao.Impl.RouteListCategoryDaoImpl;
import com.travel.dao.Impl.RouteListDaoImpl;
import com.travel.pojo.RouteListCategory;
import com.travel.pojo.RouteListPage;
import com.travel.pojo.RouteListPageContent;
import com.travel.utils.JedisUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class RouteListServiceImpl{
	
	//����ҳ
	public static List<RouteListCategory> findAll() {
        //��redis��ѯ���ݣ��ж��Ƿ�Ϊ��
        //��ȡjedis�ͻ���
        Jedis jedis = JedisUtils.getJedis();
        //���Ϊ�գ������ݿ��ѯ���������������redis��,��Ϊ�գ����ؽ��
        //��redis�в�ѯ����ֵ��cid����ֵ��cname��
        Set<Tuple> categorys = jedis.zrangeWithScores("category", 0, -1);
        List<RouteListCategory> categoryList = null;
        if(null == categorys || categorys.size() == 0){
           categoryList = RouteListCategoryDaoImpl.findAll();
            //�����ݴ洢��redis
            for(int i = 0;i<categoryList.size();i++){
                jedis.zadd("category",categoryList.get(i).getCid(),categoryList.get(i).getCname() );
            }
        }else {
            //��Ϊ��redis��ȡ������Set���ϣ���Ҫת����list
            categoryList = new ArrayList<>();
            for (Tuple tuple : categorys) {
                RouteListCategory category = new RouteListCategory();
                category.setCname(tuple.getElement());
                category.setCid((int) tuple.getScore());
                categoryList.add(category);
            }
        }
        return categoryList;
    }
	
	//��ҳ ��ѯ
	public static RouteListPageContent pageQuery(int cid,int curentPage,int pageCount) {
		 RouteListPageContent p1=new RouteListPageContent();
		 List<RouteListPage> p2=null;
		 int pageSum=0;
		 int routeCount=0;
		 int start=(curentPage-1)*10;
		 if(cid==1){
			 String name="门票";
			 //�������������
		     routeCount=RouteListDaoImpl.mfindCount(name);
		     //���ҳ��
		     if(routeCount%pageCount==0){
		           pageSum=routeCount/pageCount;
		     }else{
			       pageSum=routeCount/pageCount+1;
		     }
		     //��ѯ
		     p2= RouteListDaoImpl.findOther(cid,start,name);
		     
		 }else if(cid==2){
			 String name="酒店";
			 //�������������
		     routeCount=RouteListDaoImpl.mfindCount(name);
		     //���ҳ��
		     if(routeCount%pageCount==0){
		           pageSum=routeCount/pageCount;
		     }else{
			       pageSum=routeCount/pageCount+1;
		     }
		     //��ѯ
		     p2= RouteListDaoImpl.findOther(cid,start,name);
		 }else if(cid==3){
			 String name="界";
			 //�������������
		     routeCount=RouteListDaoImpl.mfindCount(name);
		     //���ҳ��
		     if(routeCount%pageCount==0){
		           pageSum=routeCount/pageCount;
		     }else{
			       pageSum=routeCount/pageCount+1;
		     }
		     //��ѯ
		     p2= RouteListDaoImpl.findOther(cid,start,name);
		 }else if(cid==4){
			 //������
			 String name="岛";
			 //�������������
		     routeCount=RouteListDaoImpl.mfindCount(name);
		     //���ҳ��
		     if(routeCount%pageCount==0){
		           pageSum=routeCount/pageCount;
		     }else{
			       pageSum=routeCount/pageCount+1;
		     }
		     //��ѯ
		     p2= RouteListDaoImpl.findOther(cid,start,name);
		 }else if(cid==5){
			 //������
		     //�������������
		     routeCount=RouteListDaoImpl.findCount(cid);
		     //���ҳ��
		     if(routeCount%pageCount==0){
		           pageSum=routeCount/pageCount;
		     }else{
			       pageSum=routeCount/pageCount+1;
		     }
		     //��ѯ
		     p2= RouteListDaoImpl.findAll(cid,start);
		 }else if(cid==6){
			 String name="西藏";
			 //�������������
		     routeCount=RouteListDaoImpl.mfindCount(name);
		     //���ҳ��
		     if(routeCount%pageCount==0){
		           pageSum=routeCount/pageCount;
		     }else{
			       pageSum=routeCount/pageCount+1;
		     }
		     //��ѯ
		     p2= RouteListDaoImpl.findOther(cid,start,name);
		 }else if(cid==7){
			 String name="团";
			 //�������������
		     routeCount=RouteListDaoImpl.mfindCount(name);
		     //���ҳ��
		     if(routeCount%pageCount==0){
		           pageSum=routeCount/pageCount;
		     }else{
			       pageSum=routeCount/pageCount+1;
		     }
		     //��ѯ
		     p2= RouteListDaoImpl.findOther(cid,start,name);
		 }else{
			 String name="自由行";
			 //�������������
		     routeCount=RouteListDaoImpl.mfindCount(name);
		     //���ҳ��
		     if(routeCount%pageCount==0){
		           pageSum=routeCount/pageCount;
		     }else{
			       pageSum=routeCount/pageCount+1;
		     }
		     //��ѯ
		     p2= RouteListDaoImpl.findOther(cid,start,name);
		 }
		 //����
		 p1.setRouteCount(routeCount);
		 p1.setPageSum(pageSum);
		 p1.setList(p2);
		return  p1;
		   
	    }
	//���Ų�ѯ
	public static List<RouteListPage> hotQuery(int cid){
		List<RouteListPage> p=null;
		if(cid==1){
	        String name="门票";
		    p=RouteListDaoImpl.findHot(name);
		}else if(cid==2){
			String name="酒店";
			p=RouteListDaoImpl.findHot(name);
		}else if(cid==3){
			String name="界";
			p=RouteListDaoImpl.findHot(name);
		}else if(cid==4){
			String name="岛";
			p=RouteListDaoImpl.findHot(name);
		}else if(cid==5){
			String name="北";
			p=RouteListDaoImpl.findHot(name);
		}else if(cid==6){
			String name="西藏";
			p=RouteListDaoImpl.findHot(name);
		}else if(cid==7){
			String name="团";
			p=RouteListDaoImpl.findHot(name);
		}else {
			String name="自由行";
			p=RouteListDaoImpl.findHot(name);
		}
//		System.out.println(p);
		return p;
	}
	//��ҳ����
	public static RouteListPageContent search(String name,int curentPage,int pageCount) {
		RouteListPageContent p1=new RouteListPageContent();
		 List<RouteListPage> p2=null;
		 int pageSum=0;
		 int routeCount=0;
		 int start=(curentPage-1)*10;
		 routeCount=RouteListDaoImpl.mfindCount(name);
	     //���ҳ��
	     if(routeCount%pageCount==0){
	           pageSum=routeCount/pageCount;
	     }else{
		       pageSum=routeCount/pageCount+1;
	     }
	     //��ѯ
	     p2= RouteListDaoImpl.search(name,start);
	     p1.setRouteCount(routeCount);
		 p1.setPageSum(pageSum);
		 p1.setList(p2);
		return p1;
		
	}
	public static List<RouteListPage> hotSearch(String name){
		List<RouteListPage> p=null;
	    p=RouteListDaoImpl.findHot(name);
	    return p;
	}
	
}
