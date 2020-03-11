package com.travel.dao.Impl;


import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.travel.pojo.RouteListPage;

import com.travel.pojo.Route;
import com.travel.utils.DBUtils;


public class RouteListDaoImpl{
	 static DataSource ds=null; 

	 public static List<RouteListPage> findOther(int cid,int start,String name){
			List<RouteListPage> route=null;
			//��ȡ����
		    ds=DBUtils.getDs();
			JdbcTemplate jt=new JdbcTemplate(ds);
			//��ѯ
			route= jt.query("select rid,rname,price,routeIntroduce,rimage from tab_route where rname like '%"+name+"%' limit ? ,10", new BeanPropertyRowMapper<RouteListPage>(RouteListPage.class),start);
		    return  route;
		    
	     }
	 //ģ����ѯ������
     public static int mfindCount(String name){
         //��ȡ����
    	 ds=DBUtils.getDs();
    	 JdbcTemplate jt=new JdbcTemplate(ds);
    	 //��ѯ
         List<Route> datacount= jt.query("select * from tab_route where rname like '%"+name+"%'",new BeanPropertyRowMapper<Route>(Route.class));
         //�������ݴ�С
         int a= datacount.size();
		return a;
     }
	 //��ѯ��������(������ cid=5)
     public static List<RouteListPage> findAll(int cid,int start){
		List<RouteListPage> route=null;
		//��ȡ����
	    ds=DBUtils.getDs();
		JdbcTemplate jt=new JdbcTemplate(ds);
		//��ѯ
		route= jt.query("select rid,rname,price,routeIntroduce,rimage from tab_route where cid=? limit ? ,10", new BeanPropertyRowMapper<RouteListPage>(RouteListPage.class),cid,start);
	    return   route;
	    
     }
     
     //��ѯ���ݵ��ܹ����� 
     public static int  findCount(int cid){
         //��ȡ����
    	 ds=DBUtils.getDs();
    	 JdbcTemplate jt=new JdbcTemplate(ds);
    	 //��ѯ
         List<Route> datacount= jt.query("select * from tab_route where cid=?",new BeanPropertyRowMapper<Route>(Route.class),cid);
         //�������ݴ�С
         int a= datacount.size();
		return a;
     }
    
     
     //��ѯ����
      public static List<RouteListPage> findHot(String name){
 		List<RouteListPage> route=null;
 		//��ȡ����
 	    ds=DBUtils.getDs();
 		JdbcTemplate jt=new JdbcTemplate(ds);
 		//��ѯ
 		route= jt.query("select rname,price,rimage from tab_route where rname like '%"+name+"%' order by count desc  limit 0 ,5", new BeanPropertyRowMapper<RouteListPage>(RouteListPage.class));
 	    return   route;
      }
      
      //��ѯ��������
      public static List<RouteListPage> findPopular(int cid){
   		List<RouteListPage> route=null;
   		//��ȡ����
   	    ds=DBUtils.getDs();
   		JdbcTemplate jt=new JdbcTemplate(ds);
   		//��ѯ
   		route= jt.query("select rname,price,rimage from tab_route where cid=? order by count desc  limit 0 ,4", new BeanPropertyRowMapper<RouteListPage>(RouteListPage.class),cid);
   	    return   route;
        }
      //��ҳģ������
      public static List<RouteListPage> search(String name,int start){
     		List<RouteListPage> route=null;
     		//��ȡ����
     	    ds=DBUtils.getDs();
     		JdbcTemplate jt=new JdbcTemplate(ds);
     		//��ѯ
     		route= jt.query("select rid,rname,price,routeIntroduce,rimage from tab_route where rname like '%"+name+"%' limit ?,10" , new BeanPropertyRowMapper<RouteListPage>(RouteListPage.class),start);
     	    return   route;
          }
      
}
