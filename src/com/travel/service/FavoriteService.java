package com.travel.service;

import com.travel.pojo.FavoriteCount;

public interface FavoriteService {
	
	//����Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ��·�����ơ���߼۸���ͼ۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param rname  �����·������
	 * @param lowPrice  �������ͼ�
	 * @param highPrice  �������߼�
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavorite(String rname, int lowPrice, int highPrice,int currentPage);
	
	//��Ϊ��////////////////////////////////////////////////////////
	/**
	 * ��ѯ���е�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavorite(int currentPage);
		
	//�۸�Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ��·�����ƣ���ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param rname  �����·������
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYr(String rname,int currentPage);
		
	//��·��Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ����߼۸���ͼ۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param lowPrice  �������ͼ�
	 * @param highPrice  �������߼�
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYhl(int lowPrice, int highPrice, int currentPage);
	
	//��߼�Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ��·�����ơ���ͼ۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param rname  �����·������
	 * @param lowPrice  �������ͼ�
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYrl(String rname, int lowPrice,int currentPage);
		
	//��ͼ�Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ��·�����ơ���߼۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param rname  �����·������
	 * @param highPrice  �������߼�
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYrh(String rname,int highPrice,int currentPage);
	
	//��߼ۺ�·����Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ����ͼ۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param lowPrice  �������ͼ�
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYl(int lowPrice, int currentPage);
		
	//��ͼۺ�·����Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ����߼۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param highPrice  �������߼�
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	public FavoriteCount findfavoriteBYh(int highPrice, int currentPage);
	
}
