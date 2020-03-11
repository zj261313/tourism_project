package com.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.travel.pojo.FavoriteCount;
import com.travel.service.Impl.FavoriteServiceImpl;


@Controller 
@RequestMapping("/favorite")
public class FavoriteServlet {
	
	/**
	 * ����·�ߣ����ղ������ݼ���˳�����ǵ���Ϣ��ʾ���ղ����а�
	 * @param rname  �����·������
	 * @param lowPrice  �������ͼ�
	 * @param highPrice  �������߼�
	 * @param currentPage   ���ҳ�룬���뵱ǰҳ
	 * @return  ����һ��json����FavoriteCount���������У��ܹ�����ҳ��pageCount;
	 * ������ѯ�����ղض��·�ߵ���Ϣ�Ķ��󼯺� ��List<FavoriteRoute> favoriteRoutelist
	 */
	@RequestMapping("/favoriteOrder")
	@ResponseBody
	public FavoriteCount order(String rname,int lowPrice,int highPrice,int currentPage){
		
		System.out.println("rname"+rname);
		System.out.println("lowPrice"+lowPrice);
		System.out.println("highPrice"+highPrice);
		System.out.println("currentPage"+currentPage);
		
		FavoriteServiceImpl fs = new FavoriteServiceImpl();
		FavoriteCount fc = new FavoriteCount();
		
		if(rname == "" && highPrice == -1 && lowPrice == -1){
			//��Ϊ�գ���������
			//System.out.println("��Ϊ�գ���������");
			fc = fs.findfavorite(currentPage);
		}else if(rname !="" && highPrice == -1 && lowPrice == -1){
			//�۸�Ϊ�գ���·��������
			//System.out.println("�۸�Ϊ�գ���·��������");
			fc = fs.findfavoriteBYr(rname,currentPage);
		}else if(rname == "" && (highPrice != -1 && lowPrice != -1)){
			//·����Ϊ�գ����۸��������
			//System.out.println("·����Ϊ�գ����۸��������");
			fc = fs.findfavoriteBYhl(lowPrice,highPrice, currentPage);
		}else if(highPrice == -1 && rname !="" && lowPrice != -1 ){
			//��߼�Ϊ�գ���·��������ͼ۲���
			//System.out.println("��߼�Ϊ�գ���·��������ͼ۲���");
			fc = fs.findfavoriteBYrl(rname,lowPrice,currentPage);
		}else if(lowPrice == -1 && rname !="" && highPrice != -1){
			//��ͼ�Ϊ�գ���·��������߼۲���
			//System.out.println("��ͼ�Ϊ�գ���·��������߼۲���");
			fc = fs.findfavoriteBYrh(rname,highPrice,currentPage);
		}else if(rname == "" && highPrice == -1 && lowPrice != -1){
			//��߼ۺ�·����Ϊ�գ�����ͼ۲���
			//System.out.println("��߼ۺ�·����Ϊ�գ�����ͼ۲���");
			fc = fs.findfavoriteBYl(lowPrice,currentPage);
		}else if(rname == "" && lowPrice == -1 && highPrice != -1){
			//��ͼۺ�·����Ϊ�գ�����߼۲���
			//System.out.println("��ͼۺ�·����Ϊ�գ�����߼۲���");
			fc = fs.findfavoriteBYh(highPrice,currentPage);
		}else{
			//����Ϊ�գ���·�����ͼ۸��������
			//System.out.println("����Ϊ�գ���·�����ͼ۸��������");
			fc = fs.findfavorite(rname, lowPrice, highPrice, currentPage);
		}
	
		return fc;
	}
}
