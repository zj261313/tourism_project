package com.travel.dao;

import java.util.List;
import com.travel.pojo.FavoriteRoute;

public interface FavoriteRouteDao {
	
	//����Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ��·�����ơ���߼۸���ͼ۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param rname  �����·������
	 * @param lowPrice	  �������ͼ�
	 * @param highPrice  �������߼�
	 * @param startRow  �Ӳ�ѯ������������ݵĵ�    startRow  ����ʾ
	 * @return  ����һ�� List<FavoriteRoute> ���ϣ�������·������ ��ͼƬ���۸��ղ�������Ϣ
	 */
	public List<FavoriteRoute> findRoute(String rname,  int lowPrice,int highPrice, int startRow );
	
	/**
	 * ͨ��·�����ơ���߼۸���ͼ۸񣬲�ѯ�����������ݵ�·�ߵ��ܸ���
	 * @param rname  �����·������
	 * @param lowPrice	  �������ͼ�
	 * @param highPrice  �������߼�
	 * @return ���ز�ѯ���ķ����������ݵ�·�ߵ��ܵĸ���
	 */
	public int findRouteCount(String rname, int lowPrice ,int highPrice);
	
	//��Ϊ��////////////////////////////////////////////////////////
	/**
	 * ��ѯ����·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param startRow  �Ӳ�ѯ������������ݵĵ�    startRow  ����ʾ
	 * @return  ����һ�� List<FavoriteRoute> ���ϣ�������·������ ��ͼƬ���۸��ղ�������Ϣ
	 */
    public  List<FavoriteRoute> findRoute(int startRow);
	/**
	 * ��ѯ���е�·�ߵ��ܸ���
	 * @return ��������·�ߵ��ܵĸ���
	 */
    public int findRouteCount();
    
    //�۸�Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ��·�����ƣ���ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param rname  �����·������
	 * @param startRow  �Ӳ�ѯ������������ݵĵ�    startRow  ����ʾ
	 * @return  ����һ�� List<FavoriteRoute> ���ϣ�������·������ ��ͼƬ���۸��ղ�������Ϣ
	 */
    public  List<FavoriteRoute> findRoute(String rname,int startRow);
	/**
	 * ͨ��·�����ƣ���ѯ�����������ݵ�·�ߵ��ܸ���
	 * @param rname  �����·������
	 * @return ���ز�ѯ���ķ����������ݵ�·�ߵ��ܵĸ���
	 */
    public int findRouteCount(String rname);
    
    //��·��Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ����߼۸���ͼ۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param lowPrice	  �������ͼ�
	 * @param highPrice  �������߼�
	 * @param startRow  �Ӳ�ѯ������������ݵĵ�    startRow  ����ʾ
	 * @return  ����һ�� List<FavoriteRoute> ���ϣ�������·������ ��ͼƬ���۸��ղ�������Ϣ
	 */
    public  List<FavoriteRoute> findRouteBYhl(int highPrice, int lowPrice,int startRow);
	/**
	 * ͨ����߼۸񣬲�ѯ�����������ݵ�·�ߵ��ܸ���
	 * @param highPrice  �������߼�
	 * @return ���ز�ѯ���ķ����������ݵ�·�ߵ��ܵĸ���
	 */
    public int findRouteCountBYhl(int highPrice, int lowPrice);
    
    
    //��߼�Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ��·�����ơ���ͼ۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param rname  �����·������
	 * @param lowPrice  �������ͼ�
	 * @param startRow  �Ӳ�ѯ������������ݵĵ�    startRow  ����ʾ
	 * @return  ����һ�� List<FavoriteRoute> ���ϣ�������·������ ��ͼƬ���۸��ղ�������Ϣ
	 */
    public  List<FavoriteRoute> findRouteBYrl(String rname,int lowPrice,int startRow);
	/**
	 * ͨ��·�����ơ���ͼ۸񣬲�ѯ�����������ݵ�·�ߵ��ܸ���
	 * @param rname  �����·������
	 * @param lowPrice	  �������ͼ�

	 * @return ���ز�ѯ���ķ����������ݵ�·�ߵ��ܵĸ���
	 */
    public int findRouteCountBYrl(String rname, int lowPrice) ;
    
    //��ͼ�Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ��·�����ơ���߼۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param rname  �����·������
	 * @param highPrice  �������߼�
	 * @param startRow  �Ӳ�ѯ������������ݵĵ�    startRow  ����ʾ
	 * @return  ����һ�� List<FavoriteRoute> ���ϣ�������·������ ��ͼƬ���۸��ղ�������Ϣ
	 */
    public  List<FavoriteRoute> findRouteBYrh(String rname,int highPrice,int startRow);
	/**
	 * ͨ��·�����ơ���߼۸񣬲�ѯ�����������ݵ�·�ߵ��ܸ���
	 * @param rname  �����·������
	 * @param highPrice  �������߼�
	 * @return ���ز�ѯ���ķ����������ݵ�·�ߵ��ܵĸ���
	 */
    public int findRouteCountBYrh(String rname, int highPrice);
    
    //��߼ۺ�·����Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ����ͼ۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param lowPrice	  �������ͼ�
	 * @param startRow  �Ӳ�ѯ������������ݵĵ�    startRow  ����ʾ
	 * @return  ����һ�� List<FavoriteRoute> ���ϣ�������·������ ��ͼƬ���۸��ղ�������Ϣ
	 */
    public  List<FavoriteRoute> findRouteBYl(int lowPrice,int startRow);
	/**
	 * ͨ����ͼ۸񣬲�ѯ�����������ݵ�·�ߵ��ܸ���
	 * @param lowPrice	  �������ͼ�
	 * @return ���ز�ѯ���ķ����������ݵ�·�ߵ��ܵĸ���
	 */
    public int findRouteCountBYl(int lowPrice);
    
    //��ͼۺ�·����Ϊ��////////////////////////////////////////////////////////
	/**
	 * ͨ����߼۸񣬲�ѯ�����������ݵ�·�ߵ���Ϣ�������ǰ����ղش����ݼ�����
	 * @param highPrice  �������߼�
	 * @param startRow  �Ӳ�ѯ������������ݵĵ�    startRow  ����ʾ
	 * @return  ����һ�� List<FavoriteRoute> ���ϣ�������·������ ��ͼƬ���۸��ղ�������Ϣ
	 */
    public  List<FavoriteRoute> findRouteBYh(int highPrice,int startRow);
	/**
	 * ͨ����߼۸񣬲�ѯ�����������ݵ�·�ߵ��ܸ���
	 * @param highPrice  �������߼�
	 * @return ���ز�ѯ���ķ����������ݵ�·�ߵ��ܵĸ���
	 */
    public int findRouteCountBYh(int highPrice);
    
}
