package com.travel.service;

import com.travel.pojo.FavoriteCount;

public interface FavoriteService {
	
	//都不为空////////////////////////////////////////////////////////
	/**
	 * 通过路线名称、最高价格、最低价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param rname  输入的路线名称
	 * @param lowPrice  输入的最低价
	 * @param highPrice  输入的最高价
	 * @param currentPage   点击页码，传入当前页
	 * @return  返回一个FavoriteCount对象，里面有，总共多少页：pageCount;
	 * 包含查询到的收藏多的路线的信息的对象集合 ：List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavorite(String rname, int lowPrice, int highPrice,int currentPage);
	
	//都为空////////////////////////////////////////////////////////
	/**
	 * 查询所有的路线的信息，将它们按照收藏次数递减排序
	 * @param currentPage   点击页码，传入当前页
	 * @return  返回一个FavoriteCount对象，里面有，总共多少页：pageCount;
	 * 包含查询到的收藏多的路线的信息的对象集合 ：List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavorite(int currentPage);
		
	//价格为空////////////////////////////////////////////////////////
	/**
	 * 通过路线名称，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param rname  输入的路线名称
	 * @param currentPage   点击页码，传入当前页
	 * @return  返回一个FavoriteCount对象，里面有，总共多少页：pageCount;
	 * 包含查询到的收藏多的路线的信息的对象集合 ：List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYr(String rname,int currentPage);
		
	//线路名为空////////////////////////////////////////////////////////
	/**
	 * 通过最高价格、最低价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param lowPrice  输入的最低价
	 * @param highPrice  输入的最高价
	 * @param currentPage   点击页码，传入当前页
	 * @return  返回一个FavoriteCount对象，里面有，总共多少页：pageCount;
	 * 包含查询到的收藏多的路线的信息的对象集合 ：List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYhl(int lowPrice, int highPrice, int currentPage);
	
	//最高价为空////////////////////////////////////////////////////////
	/**
	 * 通过路线名称、最低价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param rname  输入的路线名称
	 * @param lowPrice  输入的最低价
	 * @param currentPage   点击页码，传入当前页
	 * @return  返回一个FavoriteCount对象，里面有，总共多少页：pageCount;
	 * 包含查询到的收藏多的路线的信息的对象集合 ：List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYrl(String rname, int lowPrice,int currentPage);
		
	//最低价为空////////////////////////////////////////////////////////
	/**
	 * 通过路线名称、最高价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param rname  输入的路线名称
	 * @param highPrice  输入的最高价
	 * @param currentPage   点击页码，传入当前页
	 * @return  返回一个FavoriteCount对象，里面有，总共多少页：pageCount;
	 * 包含查询到的收藏多的路线的信息的对象集合 ：List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYrh(String rname,int highPrice,int currentPage);
	
	//最高价和路线名为空////////////////////////////////////////////////////////
	/**
	 * 通过最低价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param lowPrice  输入的最低价
	 * @param currentPage   点击页码，传入当前页
	 * @return  返回一个FavoriteCount对象，里面有，总共多少页：pageCount;
	 * 包含查询到的收藏多的路线的信息的对象集合 ：List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYl(int lowPrice, int currentPage);
		
	//最低价和路线名为空////////////////////////////////////////////////////////
	/**
	 * 通过最高价格，查询符合输入内容的路线的信息，将它们按照收藏次数递减排序
	 * @param highPrice  输入的最高价
	 * @param currentPage   点击页码，传入当前页
	 * @return  返回一个FavoriteCount对象，里面有，总共多少页：pageCount;
	 * 包含查询到的收藏多的路线的信息的对象集合 ：List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYh(int highPrice, int currentPage);
	
}
