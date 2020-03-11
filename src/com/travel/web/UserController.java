package com.travel.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.pojo.ResultInfo;
import com.travel.pojo.User;
import com.travel.service.Impl.UserServiceImpl;
import com.travel.utils.JDBCUtils;

import javafx.scene.Parent;

@Controller
@RequestMapping ("/user")
public class UserController {
	UserServiceImpl us = new UserServiceImpl();
	ResultInfo info = new ResultInfo();
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	
	@RequestMapping("/register")
	@ResponseBody
	public ResultInfo register(User user,String check,HttpServletRequest req) {
		info=us.register(user,check,req);
		//System.out.println(user);
		//System.out.println("ע��----"+info.isFlag());
		return info;
	}
	
	
	@RequestMapping("/username")
	@ResponseBody
	public ResultInfo findusername(String username) {
		info = us.findusername(username);
		//System.out.println("�û���----"+info.isFlag());
		return info;
	}
	
	
	@RequestMapping("/mail")
	public String checkEmail(String code) {
		Integer i = jt.queryForObject("select count(*) from tab_user where code=?", Integer.class, code);
		if(i!=0){
			jt.update("update tab_user set status=? where code=?", "Y",code);
			return "success";
		}else{
			return "false";
		}
	}
	
	@RequestMapping("/checkcode")
	public ResultInfo checkcode(HttpServletRequest req,String check){
		//System.out.println("�������֤��Ϊ��"+check);
	    info=us.check(check, req);
	    //System.out.println("��֤��----"+info.isFlag());
	return info;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public ResultInfo login(User user,String check,HttpServletRequest req) {
		info=us.login(user, check, req);
		return info;
	}
	
	@RequestMapping("/showName")
	@ResponseBody
	public ResultInfo showName(HttpServletRequest req){
		String name=(String)req.getSession().getAttribute("name");
		info.setData(name);
		//System.out.println("����Ϊ��+++"+user.getName());
		return info;
	}
	
	@RequestMapping("/exit")
	public String exit(HttpServletRequest req,HttpServletResponse res){
		req.getSession().invalidate();
		return "exit";
	}
	
	@RequestMapping("/findUser")	
	@ResponseBody
	public String findUser(HttpServletRequest req){
		
		User user=(User) req.getSession().getAttribute("user");
	    if(user==null){
	 	  return "false";
	 	   
	    }else{
	 	   return "true";
	    }
		
	}
	
	/*
	@RequestMapping("/h1")
	@ResponseBody
	public String hello1(HttpServletRequest req){
		req.getSession().setAttribute("user", "zj");
		return null;
	}
	
	@RequestMapping("/h2")
	@ResponseBody
	public String hello2(HttpServletRequest req){
		String user=(String) req.getSession().getAttribute("user");
		return user;
	}*/
}
