package com.travel.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.pojo.RouteListCategory;
import com.travel.pojo.RouteListPage;
import com.travel.pojo.RouteListPageContent;
import com.travel.service.Impl.RouteListServiceImpl;


@Controller //�൱��newһ������
@RequestMapping("/category")
public class RouteListWeb {
     @RequestMapping("/findAll")
     @ResponseBody
	 public static List<RouteListCategory> cate(){
		List<RouteListCategory> categoryList=RouteListServiceImpl.findAll();
		return categoryList;
	 }
     
     @RequestMapping("/pageRoute")
     @ResponseBody
     public static RouteListPageContent page(int cid,int curentPage,int pageCount){
    	 RouteListPageContent p1=RouteListServiceImpl.pageQuery(cid, curentPage, pageCount);
		return p1;
     }
     
     @RequestMapping("/hot")
     @ResponseBody
     public static List<RouteListPage> hot(int cid){
    	 List<RouteListPage> p1=RouteListServiceImpl.hotQuery(cid);
		return p1;
     }
     
     @RequestMapping("/search")
     @ResponseBody
     public static RouteListPageContent search(String searchName,int curentPage,int pageCount){
    	 //PageContent p1=travelService.search(searchName,curentPage,pageCount);
    	 RouteListPageContent p1=null;
    	 try {
			String s = URLDecoder.decode(searchName,"UTF-8");
			 p1=RouteListServiceImpl.search(s,curentPage,pageCount);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    	 
		return p1;
     }
     
     @RequestMapping("/searchHot")
     @ResponseBody
     public static  List<RouteListPage> searchHot(String searchName){
    	 //PageContent p1=travelService.search(searchName,curentPage,pageCount);
    	 List<RouteListPage> p1=null;
    	 try {
			String s = URLDecoder.decode(searchName,"UTF-8");
			p1=RouteListServiceImpl.hotSearch(s);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    	 
		return p1;
     }
     

}
