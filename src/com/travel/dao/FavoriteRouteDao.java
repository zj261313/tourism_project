package com.travel.dao;

import java.util.List;
import com.travel.pojo.FavoriteRoute;

public interface FavoriteRouteDao {
	
	//都不为空////////////////////////////////////////////////////////
	/**
	 * 通过路线名称、最高价格、最低价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param rname  输入的路线名称
	 * @param lowPrice	  输入的最低价
	 * @param highPrice  输入的最高价
	 * @param startRow  从查询到的许多条数据的第    startRow  条显示
	 * @return  返回一个 List<FavoriteRoute> 集合，里面有路线名称 、图片、价格、收藏量等信息
	 */
	public List<FavoriteRoute> findRoute(String rname,  int lowPrice,int highPrice, int startRow );
	
	/**
	 * 通过路线名称、最高价格、最低价格，查询符合输入内容的路线的总个数
	 * @param rname  输入的路线名称
	 * @param lowPrice	  输入的最低价
	 * @param highPrice  输入的最高价
	 * @return 返回查询到的符合输入内容的路线的总的个数
	 */
	public int findRouteCount(String rname, int lowPrice ,int highPrice);
	
	//都为空////////////////////////////////////////////////////////
	/**
	 * 查询所有路线的信息，将它们按照收藏次数递减排序
	 * @param startRow  从查询到的许多条数据的第    startRow  条显示
	 * @return  返回一个 List<FavoriteRoute> 集合，里面有路线名称 、图片、价格、收藏量等信息
	 */
    public  List<FavoriteRoute> findRoute(int startRow);
	/**
	 * 查询所有的路线的总个数
	 * @return 返回所有路线的总的个数
	 */
    public int findRouteCount();
    
    //价格为空////////////////////////////////////////////////////////
	/**
	 * 通过路线名称，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param rname  输入的路线名称
	 * @param startRow  从查询到的许多条数据的第    startRow  条显示
	 * @return  返回一个 List<FavoriteRoute> 集合，里面有路线名称 、图片、价格、收藏量等信息
	 */
    public  List<FavoriteRoute> findRoute(String rname,int startRow);
	/**
	 * 通过路线名称，查询符合输入内容的路线的总个数
	 * @param rname  输入的路线名称
	 * @return 返回查询到的符合输入内容的路线的总的个数
	 */
    public int findRouteCount(String rname);
    
    //线路名为空////////////////////////////////////////////////////////
	/**
	 * 通过最高价格、最低价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param lowPrice	  输入的最低价
	 * @param highPrice  输入的最高价
	 * @param startRow  从查询到的许多条数据的第    startRow  条显示
	 * @return  返回一个 List<FavoriteRoute> 集合，里面有路线名称 、图片、价格、收藏量等信息
	 */
    public  List<FavoriteRoute> findRouteBYhl(int highPrice, int lowPrice,int startRow);
	/**
	 * 通过最高价格，查询符合输入内容的路线的总个数
	 * @param highPrice  输入的最高价
	 * @return 返回查询到的符合输入内容的路线的总的个数
	 */
    public int findRouteCountBYhl(int highPrice, int lowPrice);
    
    
    //最高价为空////////////////////////////////////////////////////////
	/**
	 * 通过路线名称、最低价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param rname  输入的路线名称
	 * @param lowPrice  输入的最低价
	 * @param startRow  从查询到的许多条数据的第    startRow  条显示
	 * @return  返回一个 List<FavoriteRoute> 集合，里面有路线名称 、图片、价格、收藏量等信息
	 */
    public  List<FavoriteRoute> findRouteBYrl(String rname,int lowPrice,int startRow);
	/**
	 * 通过路线名称、最低价格，查询符合输入内容的路线的总个数
	 * @param rname  输入的路线名称
	 * @param lowPrice	  输入的最低价

	 * @return 返回查询到的符合输入内容的路线的总的个数
	 */
    public int findRouteCountBYrl(String rname, int lowPrice) ;
    
    //最低价为空////////////////////////////////////////////////////////
	/**
	 * 通过路线名称、最高价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param rname  输入的路线名称
	 * @param highPrice  输入的最高价
	 * @param startRow  从查询到的许多条数据的第    startRow  条显示
	 * @return  返回一个 List<FavoriteRoute> 集合，里面有路线名称 、图片、价格、收藏量等信息
	 */
    public  List<FavoriteRoute> findRouteBYrh(String rname,int highPrice,int startRow);
	/**
	 * 通过路线名称、最高价格，查询符合输入内容的路线的总个数
	 * @param rname  输入的路线名称
	 * @param highPrice  输入的最高价
	 * @return 返回查询到的符合输入内容的路线的总的个数
	 */
    public int findRouteCountBYrh(String rname, int highPrice);
    
    //最高价和路线名为空////////////////////////////////////////////////////////
	/**
	 * 通过最低价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param lowPrice	  输入的最低价
	 * @param startRow  从查询到的许多条数据的第    startRow  条显示
	 * @return  返回一个 List<FavoriteRoute> 集合，里面有路线名称 、图片、价格、收藏量等信息
	 */
    public  List<FavoriteRoute> findRouteBYl(int lowPrice,int startRow);
	/**
	 * 通过最低价格，查询符合输入内容的路线的总个数
	 * @param lowPrice	  输入的最低价
	 * @return 返回查询到的符合输入内容的路线的总的个数
	 */
    public int findRouteCountBYl(int lowPrice);
    
    //最低价和路线名为空////////////////////////////////////////////////////////
	/**
	 * 通过最高价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param highPrice  输入的最高价
	 * @param startRow  从查询到的许多条数据的第    startRow  条显示
	 * @return  返回一个 List<FavoriteRoute> 集合，里面有路线名称 、图片、价格、收藏量等信息
	 */
    public  List<FavoriteRoute> findRouteBYh(int highPrice,int startRow);
	/**
	 * 通过最高价格，查询符合输入内容的路线的总个数
	 * @param highPrice  输入的最高价
	 * @return 返回查询到的符合输入内容的路线的总的个数
	 */
    public int findRouteCountBYh(int highPrice);
    
}
