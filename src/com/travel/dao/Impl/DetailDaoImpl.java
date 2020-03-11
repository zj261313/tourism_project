package com.travel.dao.Impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.travel.dao.DetailDao;
import com.travel.pojo.Category;
import com.travel.pojo.Route;
import com.travel.pojo.RouteImg;
import com.travel.pojo.Seller;
import com.travel.utils.JDBCUtils;

public class DetailDaoImpl implements DetailDao {
	JdbcTemplate js=new JdbcTemplate(JDBCUtils.getDataSource());
	
		//�ҵ������·����Ϣ
		public Route findroutDetail(int id){
			Route route =null;
			route=js.queryForObject("select * from tab_route where rid=?",new BeanPropertyRowMapper<Route>(Route.class), id);
			return route;
		}
		
		//�ҵ����ͼƬ��Ϣ
		public List<RouteImg> findrouteImgDetail(int id){
			List<RouteImg> list=null;
			list=js.query("select * from tab_route_img where rid=?",new BeanPropertyRowMapper<RouteImg>(RouteImg.class), id);
			return list;
		}
		
		//�ҵ��̼���Ϣ
		public Seller findSellerDetail(int id){
			Seller seller=null;
			int sid=findroutDetail(id).getSid();
			seller=js.queryForObject("select * from tab_seller where sid=?",new BeanPropertyRowMapper<Seller>(Seller.class), sid);
			return seller;
		}
		
		//�ҵ���������
		public Category fincategory(int id){
			Category category=null;
			int cid=findroutDetail(id).getCid();
			category=js.queryForObject("select * from tab_category where cid=?",new BeanPropertyRowMapper<Category>(Category.class), cid);
			return category;
		}
}
