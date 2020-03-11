package com.travel.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DBUtils {
	public static Connection conn;
	public static String drivername;
	public static String url;
	public static String username;
	public static String password;
	private static 	DataSource ds;
	//��̬�����
//	static {
//		Properties p=new Properties();
//		try {
//			p.load(DBUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
//			drivername=(String)p.get("driverClassName");
//			url=(String)p.get("url");
//			username=(String)p.get("username");
//			password=(String)p.get("password");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * ��ȡ����
	 * @return
	 */
	
		
		
		static{

		try {
			Properties p = new Properties();
			p.load(DBUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			ds = DruidDataSourceFactory.createDataSource(p);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
    public static DataSource getDs(){
		return ds;
	}
	
	 /**
	  * 
	  * @param rs
	  * @param pst
	  * @param conn
	  */
     
	public static void close(ResultSet rs, PreparedStatement pst,Connection conn){
		if(rs!=null){
		     try {
			      rs.close();
		     } catch (SQLException e) {
			      e.printStackTrace();
		     }
		}
		if(pst!=null){
		     
			      try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		     
		}
		if(conn!=null){
		     try {
			      conn.close();
		     } catch (SQLException e) {
			      e.printStackTrace();
		     }
		}
	}
}
