package com.travel.dao.Impl;

import java.sql.Date;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.travel.dao.RouteDao;
import com.travel.utils.JDBCUtils;

public class RouteDaoImpl implements RouteDao{

	//查找rid
	@Override
	public int findRid(String rname) {
		DataSource ds = JDBCUtils.getDataSource();
		JdbcTemplate jt=new JdbcTemplate(ds);
		int rid;
		rid = jt.queryForObject("select rid from tab_route where rname=?", new Object[] {rname}, java.lang.Integer.class);
		
			return rid;
		
	   
	}

	@Override
	public int find(int rid, int uid) {
				DataSource ds = JDBCUtils.getDataSource();
				JdbcTemplate jt=new JdbcTemplate(ds);
				int len = jt.queryForObject("select count(*) from tab_favorite where rid=? and uid=?",new Object[] {rid,uid}, java.lang.Integer.class);
		        
		return len;
	}

	@Override
	public void add(int rid,String date, int uid) {
		
		DataSource ds = JDBCUtils.getDataSource();
		JdbcTemplate jt=new JdbcTemplate(ds);
		jt.update("insert into tab_favorite values (?,?,?)", rid,date,uid);
		
	}
	
	public void update(int rid){
		DataSource ds = JDBCUtils.getDataSource();
		JdbcTemplate jt=new JdbcTemplate(ds);
		jt.update("update tab_route set count=count+1 where rid=?",rid);
	}
	
	//取消收藏
	
	public void nocollect(int rid,int uid){
		
		DataSource ds = JDBCUtils.getDataSource();
		JdbcTemplate jt=new JdbcTemplate(ds);
		jt.update("delete from tab_favorite where rid=? and uid=?",rid,uid);
		jt.update("update tab_route set count=count-1 where rid=?",rid);
		
	}
	
	
	
	/*@Override
	public int addCollection() {
		DataSource ds = JDBCUtils.getDataSource();
		JdbcTemplate jt=new JdbcTemplate(ds);
		int len = jt.update("insert into tab_favorite values (1,2009/1/4,5)");
		System.out.println(len);
		return len;
	}

	@Override
	public int deleteCollection(int rid) {
		DataSource ds = JDBCUtils.getDataSource();
		JdbcTemplate jt=new JdbcTemplate(ds);
		int len = jt.update("delete from tab_favorite where rid=?",rid);
		return len;
	}
*/
	
	

}
