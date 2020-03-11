package com.travel.dao.Impl;


import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.travel.dao.CollectionDao;
import com.travel.pojo.Collection;
import com.travel.utils.JDBCUtils;

public class CollectionDaoIpml  implements CollectionDao{

	
	//查询我的收藏并输出
	@Override
	public List<Collection> getAllItems(int uid,int startpage) {//当前第几页
		  List<Collection> list = new ArrayList<Collection>();  //商品集合
		  DataSource ds = JDBCUtils.getDataSource();
	      JdbcTemplate jt=new JdbcTemplate(ds);
		  try {
			list = jt.query("SELECT tab_route.rid,tab_route.rname,tab_route.price,tab_route.rimage FROM tab_route,tab_favorite WHERE tab_route.rid=tab_favorite.rid and tab_favorite.uid=? limit ?,12 ", new BeanPropertyRowMapper<Collection>(Collection.class),uid,startpage);
		} catch (Exception e) {
			
		}
		  System.out.println(list);
		  
		  
		return list;
	}
//总共数据条数
	@Override
	public int getCount(int uid) {
		 DataSource ds = JDBCUtils.getDataSource();
	      JdbcTemplate jt=new JdbcTemplate(ds);
		int get = jt.queryForObject("SELECT count(*) FROM tab_route,tab_favorite WHERE tab_route.rid=tab_favorite.rid and tab_favorite.uid=?", new Object[] {uid},java.lang.Integer.class) ;
		return get;
	}
	
	

}
