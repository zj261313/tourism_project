 package com.travel.service.Impl;

import java.util.List;

import com.travel.dao.Impl.FavoriteRouteDaoImpl;
import com.travel.pojo.FavoriteCount;
import com.travel.pojo.FavoriteRoute;
import com.travel.service.FavoriteService;

public class FavoriteServiceImpl implements FavoriteService{
	private int startRow = 0;  //�Ӳ�ѯ������������ݵĵ�  startRow  ����ʾ
	private int PageSize = 8;  //ÿҳ�Ĵ�С��ÿҳ��ʾ8������
	private int pageCount = 0;//ҳ������
	private FavoriteRouteDaoImpl rdi = new FavoriteRouteDaoImpl();

	//����Ϊ��
	@Override
	public FavoriteCount findfavorite(String rname, int lowPrice, int highPrice, int currentPage) {
		//int highPrice = Integer.parseInt(hPrice);

		if(currentPage == 1){
			startRow = 0;
		}else{
			startRow = (currentPage - 1)*PageSize;
		}
		FavoriteCount fc = new FavoriteCount();
		List<FavoriteRoute> favoriteRoutelist = rdi.findRoute(rname, lowPrice, highPrice, startRow);
		
		int count = rdi.findRouteCount(rname, lowPrice, highPrice);
		if((count % PageSize)!=0){
			pageCount = count/PageSize+1;
		}else{
			pageCount = count/PageSize;
		}
		fc.setPageCount(pageCount);
		fc.setFavoriteRoutelist(favoriteRoutelist);
		return fc;
	}
	
	
	//��Ϊ��
	@Override
	public FavoriteCount findfavorite(int currentPage) {
		if(currentPage == 1){
			startRow = 0;
		}else{
			startRow = (currentPage - 1)*PageSize;
		}
		
		FavoriteCount fc = new FavoriteCount();
		List<FavoriteRoute> favoriteRoutelist = rdi.findRoute(startRow);

		int count = rdi.findRouteCount();
		if((count % PageSize)!=0){
			pageCount = count/PageSize+1;
		}else{
			pageCount = count/PageSize;
		}
		fc.setPageCount(pageCount);
		fc.setFavoriteRoutelist(favoriteRoutelist);
		return fc;
	}
	
	
	//�۸�Ϊ��
	@Override
	public FavoriteCount findfavoriteBYr(String rname,int currentPage) {

		if(currentPage == 1){
			startRow = 0;
		}else{
			startRow = (currentPage - 1)*PageSize;
		}
		
		FavoriteCount fc = new FavoriteCount();
		List<FavoriteRoute> favoriteRoutelist = rdi.findRoute(rname,startRow);
		
		int count = rdi.findRouteCount(rname);
		if((count % PageSize)!=0){
			pageCount = count/PageSize+1;
		}else{
			pageCount = count/PageSize;
		}
		fc.setPageCount(pageCount);
		fc.setFavoriteRoutelist(favoriteRoutelist);
		return fc;
	}
	
	
	//��·��Ϊ��
	@Override
	public FavoriteCount findfavoriteBYhl(int lowPrice,int highPrice,int currentPage) {

		if(currentPage == 1){
			startRow = 0;
		}else{
			startRow = (currentPage - 1)*PageSize;
		}
		FavoriteCount fc = new FavoriteCount();
		List<FavoriteRoute> favoriteRoutelist = rdi.findRouteBYhl(lowPrice, highPrice, startRow);

		int count = rdi.findRouteCountBYhl(lowPrice ,highPrice );
		if((count % PageSize)!=0){
			pageCount = count/PageSize+1;
		}else{
			pageCount = count/PageSize;
		}
		fc.setPageCount(pageCount);
		fc.setFavoriteRoutelist(favoriteRoutelist);
		return fc;
	}
	
	
	//��߼�Ϊ��
	@Override
	public FavoriteCount findfavoriteBYrl(String rname, int lowPrice,int currentPage) {

		if(currentPage == 1){
			startRow = 0;
		}else{
			startRow = (currentPage - 1)*PageSize;
		}
		FavoriteCount fc = new FavoriteCount();
		List<FavoriteRoute> favoriteRoutelist = rdi.findRouteBYrl(rname, lowPrice,startRow);

		int count = rdi.findRouteCountBYrl(rname,lowPrice);
		if((count % PageSize)!=0){
			pageCount = count/PageSize+1;
		}else{
			pageCount = count/PageSize;
		}
		fc.setPageCount(pageCount);
		fc.setFavoriteRoutelist(favoriteRoutelist);
		return fc;
	}
	
	//��ͼ�Ϊ��
	@Override
	public FavoriteCount findfavoriteBYrh(String rname,int highPrice,int currentPage) {

		if(currentPage == 1){
			startRow = 0;
		}else{
			startRow = (currentPage - 1)*PageSize;
		}
		FavoriteCount fc = new FavoriteCount();
		List<FavoriteRoute> favoriteRoutelist = rdi.findRouteBYrh(rname, highPrice,startRow);

		int count = rdi.findRouteCountBYrh(rname, highPrice);
		if((count % PageSize)!=0){
			pageCount = count/PageSize+1;
		}else{
			pageCount = count/PageSize;
		}
		fc.setPageCount(pageCount);
		fc.setFavoriteRoutelist(favoriteRoutelist);
		return fc;
	}
	
	
	//��߼ۺ�·����Ϊ��
	@Override
	public FavoriteCount findfavoriteBYl(int lowPrice,int currentPage) {

		if (currentPage == 1) {
			startRow = 0;
		} else {
			startRow = (currentPage - 1) * PageSize;
		}
		FavoriteCount fc = new FavoriteCount();
		List<FavoriteRoute> favoriteRoutelist = rdi.findRouteBYl(lowPrice, startRow);
		
		int count = rdi.findRouteCountBYl(lowPrice);
		if ((count % PageSize) != 0) {
			pageCount = count / PageSize + 1;
		} else {
			pageCount = count / PageSize;
		}
		fc.setPageCount(pageCount);
		fc.setFavoriteRoutelist(favoriteRoutelist);
		return fc;
	}
	
	//��ͼۺ�·����Ϊ��
	@Override
	public FavoriteCount findfavoriteBYh(int highPrice,int currentPage) {

		if (currentPage == 1) {
			startRow = 0;
		} else {
			startRow = (currentPage - 1) * PageSize;
		}
		FavoriteCount fc = new FavoriteCount();
		List<FavoriteRoute> favoriteRoutelist = rdi.findRouteBYh(highPrice, startRow);

		int count = rdi.findRouteCountBYh(highPrice);
		if ((count % PageSize) != 0) {
			pageCount = count / PageSize + 1;
		} else {
			pageCount = count / PageSize;
		}
		fc.setPageCount(pageCount);
		fc.setFavoriteRoutelist(favoriteRoutelist);
		return fc;
	}
}
