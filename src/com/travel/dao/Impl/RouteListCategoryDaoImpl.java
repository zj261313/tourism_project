package com.travel.dao.Impl;

import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.travel.pojo.RouteListCategory;
import com.travel.utils.DBUtils;

public class RouteListCategoryDaoImpl{
	 private static DataSource ds=null;
	 //������
	
     public static List<RouteListCategory> findAll(){
		List<RouteListCategory> category=null;
		ds=DBUtils.getDs();
		JdbcTemplate jt=new JdbcTemplate(ds);
		category= jt.query("select * from tab_category ", new BeanPropertyRowMapper<RouteListCategory>(RouteListCategory.class));
	    return   category;
    }
}
