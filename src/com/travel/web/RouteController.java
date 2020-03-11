package com.travel.web;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.dao.Impl.RouteDaoImpl;
import com.travel.pojo.ResultInfo;
import com.travel.pojo.User;
import com.travel.service.RouteService;
import com.travel.service.Impl.RouteServiceImpl;

@Controller
@RequestMapping("/route")
public class RouteController {
	//测试
	@RequestMapping("/ceshi")
	public void ceshi(HttpServletRequest rq,HttpServletResponse rs)throws ServletException, IOException{
		RouteDaoImpl dao=new RouteDaoImpl();
		String date=rq.getParameter("s_createtime");
		String rname =rq.getParameter("rname");
		rs.setCharacterEncoding("utf-8");
		rs.setContentType("html/text;charset=utf-8");
		System.out.println(rname);
		int rid=dao.findRid(rname);
		rs.getWriter().write(rid+"");
	}
	

	
	//判断用户是否已经收藏

	@RequestMapping("/isCollect")
	public void isCollect(HttpServletRequest req,HttpServletResponse rs)throws ServletException, IOException{
		RouteServiceImpl routeservice=new RouteServiceImpl();
		RouteDaoImpl dao=new RouteDaoImpl();
		int rid=Integer.parseInt(req.getParameter("rid"));
		int uid;
       User user=(User) req.getSession().getAttribute("user");
       if(user==null){
    	   uid=0;
    	   
       }else{
    	   uid=user.getUid();
       }
		rs.setCharacterEncoding("utf-8");
		rs.setContentType("html/text;charset=utf-8");
		boolean flag = routeservice.isCollection(rid, uid);
	System.out.println(flag);
	//	rs.setContentType("application/json;charset=utf-8");
		rs.getWriter().write(flag+"");
	}

	//用户已经登录，进行收藏
	@RequestMapping("/collection")
	public void collection(HttpServletRequest req,HttpServletResponse rs)throws ServletException, IOException{
		RouteServiceImpl routeservice=new RouteServiceImpl();
		RouteDaoImpl dao=new RouteDaoImpl();
		int rid=Integer.parseInt(req.getParameter("rid"));

		String date=req.getParameter("s_createtime");
		System.out.println(rid+" "+date);
		int uid;
	       User user=(User) req.getSession().getAttribute("user");
	       if(user==null){
	    	   uid=0;
	    	   
	       }else{
	    	   uid=user.getUid();
	       }
	
		rs.setCharacterEncoding("utf-8");
		rs.setContentType("html/text;charset=utf-8");
	  routeservice.collection(rid,date,uid);
	  dao.update(rid);
		
	}
	//取消收藏
	@RequestMapping("/noCollect")
	public void noCollect(HttpServletRequest req,HttpServletResponse rs)throws ServletException, IOException{
		RouteServiceImpl routeservice=new RouteServiceImpl();
		RouteDaoImpl dao=new RouteDaoImpl();
		int rid=Integer.parseInt(req.getParameter("rid"));
		int uid;
	       User user=(User) req.getSession().getAttribute("user");
	       if(user==null){
	    	   uid=0;
	    	   
	       }else{
	    	   uid=user.getUid();
	       }
        dao.nocollect(rid,uid);
		
	}
}
