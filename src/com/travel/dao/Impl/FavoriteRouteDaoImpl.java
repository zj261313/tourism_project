package com.travel.dao.Impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.travel.dao.FavoriteRouteDao;
import com.travel.pojo.FavoriteRoute;
import com.travel.utils.JDBCUtils;

public class FavoriteRouteDaoImpl implements FavoriteRouteDao{
	//private JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	 
	//����Ϊ��
    @Override
    public  List<FavoriteRoute> findRoute(String rname, int lowPrice, int highPrice, int startRow) {
        String sql="select rid , rname , price , count ,rimage from tab_route where rname like ? and price >= ? and price <= ? order by count desc limit ? , 8";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        List<FavoriteRoute> favoriteRoutelist = jt.query(sql,new BeanPropertyRowMapper<FavoriteRoute>(FavoriteRoute.class),"%"+rname+"%",lowPrice,highPrice,startRow);

        return favoriteRoutelist ;
    }
 
    @Override
    public int findRouteCount(String rname, int lowPrice ,int highPrice) {
        String sql="select count(*) from tab_route  where rname like ? and price >= ? and price <= ? order by count desc ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        Integer count = jt.queryForObject(sql, Integer.class, "%"+rname+"%",lowPrice,highPrice);
        return count;
    }
    
    
    //��Ϊ��
    @Override
    public  List<FavoriteRoute> findRoute(int startRow) {
        String sql="select rid , rname , price , count ,rimage from tab_route order by count desc limit ? , 8 ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        List<FavoriteRoute> favoriteRoutelist = jt.query(sql,new BeanPropertyRowMapper<FavoriteRoute>(FavoriteRoute.class),startRow);
        return favoriteRoutelist ;
    }
    
    @Override
    public int findRouteCount() {
        String sql="select count(*) from tab_route order by count desc ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        Integer count = jt.queryForObject(sql, Integer.class);
        return count;
    }
    
    
    //�۸�Ϊ��
    @Override
    public  List<FavoriteRoute> findRoute(String rname,int startRow) {
        String sql="select rid , rname , price , count ,rimage from tab_route where rname like ? order by count desc limit ? , 8 ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        List<FavoriteRoute> favoriteRoutelist = jt.query(sql,new BeanPropertyRowMapper<FavoriteRoute>(FavoriteRoute.class),"%"+rname+"%",startRow);
        
        return favoriteRoutelist ;
    }
  
	@Override
	public int findRouteCount(String rname) {
		String sql = "select count(*) from tab_route  where rname like ?  order by count desc  ";
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		Integer count = jt.queryForObject(sql, Integer.class, "%"+rname+"%");
		return count;
	}

    //��·��Ϊ��
    @Override
    public  List<FavoriteRoute> findRouteBYhl(int lowPrice, int highPrice, int startRow) {
        String sql="select rid , rname , price , count ,rimage from tab_route  where price >= ? and price <= ? order by count desc limit ? , 8 ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        List<FavoriteRoute> favoriteRoutelist = jt.query(sql,new BeanPropertyRowMapper<FavoriteRoute>(FavoriteRoute.class),lowPrice,highPrice,startRow);

        return favoriteRoutelist ;
    }
 
    @Override
    public int findRouteCountBYhl(int lowPrice,int highPrice ) {
        String sql="select count(*) from tab_route  where  price >= ? and price <= ? order by count desc ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        Integer count = jt.queryForObject(sql, Integer.class, lowPrice,highPrice);
        return count;
    }
    
    
    //��߼�Ϊ��
    @Override
    public  List<FavoriteRoute> findRouteBYrl(String rname,int lowPrice,int startRow) {
        String sql="select rid , rname , price , count ,rimage from tab_route where rname like ? and price >= ?  order by count desc limit ? , 8 ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        List<FavoriteRoute> favoriteRoutelist = jt.query(sql,new BeanPropertyRowMapper<FavoriteRoute>(FavoriteRoute.class),"%"+rname+"%",lowPrice,startRow);
        
        return favoriteRoutelist ;
    }
 
    @Override
    public int findRouteCountBYrl(String rname, int lowPrice) {
        String sql="select count(*) from tab_route  where rname like ? and price >= ?  order by count desc ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        Integer count = jt.queryForObject(sql, Integer.class, "%"+rname+"%",lowPrice);
        return count;
    }
    
    
    //��ͼ�Ϊ��
    @Override
    public  List<FavoriteRoute> findRouteBYrh(String rname,int highPrice,int startRow) {
        String sql="select rid , rname , price , count ,rimage from tab_route where rname like ? and price <= ? order by count desc limit ? , 8 ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        List<FavoriteRoute> favoriteRoutelist = jt.query(sql,new BeanPropertyRowMapper<FavoriteRoute>(FavoriteRoute.class),"%"+rname+"%",highPrice,startRow);
        
        return favoriteRoutelist ;
    }
 
    @Override
    public int findRouteCountBYrh(String rname, int highPrice) {
        String sql="select count(*) from tab_route  where rname like ?  and price <= ? order by count desc ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        Integer count = jt.queryForObject(sql, Integer.class, "%"+rname+"%",highPrice);
        return count;
    }
    
    
    //��߼ۺ�·����Ϊ��
    @Override
    public  List<FavoriteRoute> findRouteBYl(int lowPrice,int startRow) {
        String sql="select rid , rname , price , count ,rimage from tab_route where  price >= ?  order by count desc limit ? , 8 ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        List<FavoriteRoute> favoriteRoutelist = jt.query(sql,new BeanPropertyRowMapper<FavoriteRoute>(FavoriteRoute.class),lowPrice,startRow);
        return favoriteRoutelist ;
    }
 
    @Override
    public int findRouteCountBYl(int lowPrice) {
        String sql="select count(*) from tab_route  where  price >= ?  order by count desc ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        Integer count = jt.queryForObject(sql, Integer.class, lowPrice);
        return count;
    }
    

    //��ͼۺ�·����Ϊ��
    @Override
    public  List<FavoriteRoute> findRouteBYh(int highPrice,int startRow) {
        String sql="select rid , rname , price , count ,rimage from tab_route where  price <= ?  order by count desc limit ? , 8 ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        List<FavoriteRoute> favoriteRoutelist = jt.query(sql,new BeanPropertyRowMapper<FavoriteRoute>(FavoriteRoute.class),highPrice,startRow);
        
        return favoriteRoutelist ;
    }
 
    @Override
    public int findRouteCountBYh(int highPrice) {
        String sql="select count(*) from tab_route  where  price <= ?  order by count desc ";
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        Integer count = jt.queryForObject(sql, Integer.class, highPrice);
        return count;
    } 
}
