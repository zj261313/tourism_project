package com.travel.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.travel.dao.DomesticAndForeignDao;
import com.travel.pojo.Route;
import com.travel.utils.JDBCUtils;

public class DomesticAndForeignDaoImpl implements DomesticAndForeignDao {
	
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	//��ѯ����
	public List<Route> finddomesticroute(){
		List<Route> domesticlist=new ArrayList<>();
		List<Route> list=jt.query("SELECT * FROM tab_route WHERE cid=5 ORDER BY `price`  DESC ",new BeanPropertyRowMapper<Route>(Route.class));
		for(int i=0;i<6;i++){
			domesticlist.add(list.get(i));
		}
		return domesticlist;
	}
	
	//��ѯ����
	public List<Route> findforeignroute(){
		List<Route> foreignlist=new ArrayList<Route>();
		List<Route> list=jt.query("SELECT * FROM tab_route WHERE cid=4 ORDER BY `price`  DESC ",new BeanPropertyRowMapper<Route>(Route.class));
		System.out.println(list);
		for(int i=0;i<6;i++){
			foreignlist.add(list.get(i));
		}
	
		return foreignlist;
	}
	
}
