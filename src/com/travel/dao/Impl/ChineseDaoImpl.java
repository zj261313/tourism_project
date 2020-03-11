package com.travel.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.travel.dao.ChineseDao;
import com.travel.pojo.Route;
import com.travel.utils.JDBCUtils;

public class ChineseDaoImpl implements ChineseDao{
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	
	/**
	 * ��db_route�������ݰ��ղش����ɸ���������
	 * ���������ı�������ǰ�ĵ�����ȡ������mostpopularlist������
	 * @return
	 */
	public List<Route> findPopularroutbydesc(){
		
		List<Route> mostpopularlist=new ArrayList<>();
		
		List<Route> list=jt.query("select * from tab_route order by `count` desc",new BeanPropertyRowMapper<Route>(Route.class));
		//System.out.println(list.toString());
		mostpopularlist.add(list.get(0));
		mostpopularlist.add(list.get(1));
		mostpopularlist.add(list.get(2));
		mostpopularlist.add(list.get(3));
		//System.out.println(mostpopularlist.toString());
		return mostpopularlist;
	}
	
	
	
	//�����������µ�4��·��
	public List<Route> findnewestlistbydesc(){
		
		List<Route> newestlist=new ArrayList<>();
		
		List<Route> list=jt.query("select * from tab_route order by rdate desc",new BeanPropertyRowMapper<Route>(Route.class));
		//System.out.println(list.toString());
		newestlist.add(list.get(0));
		newestlist.add(list.get(1));
		newestlist.add(list.get(2));
		newestlist.add(list.get(3));
		//System.out.println(mostpopularlist.toString());
		return newestlist;
	}
	
	
		//����·��
		public List<Route> findthemelistbydesc(){
			List<Route> themelist=new ArrayList<Route>();
			List<Route> list1=jt.query("select * from tab_route where cid=3",new BeanPropertyRowMapper<Route>(Route.class));
			List<Route> list2=jt.query("select * from tab_route where cid=6",new BeanPropertyRowMapper<Route>(Route.class));
			List<Route> list3=jt.query("select * from tab_route where cid=7",new BeanPropertyRowMapper<Route>(Route.class));
			List<Route> list4=jt.query("select * from tab_route where cid=8",new BeanPropertyRowMapper<Route>(Route.class));
			themelist.add(list1.get(0));
			themelist.add(list2.get(0));
			themelist.add(list3.get(0));
			themelist.add(list4.get(0));
			return themelist;
		}
}
