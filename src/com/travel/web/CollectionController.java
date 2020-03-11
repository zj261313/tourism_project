package com.travel.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.dao.Impl.CollectionDaoIpml;
import com.travel.pojo.BigCollection;
import com.travel.pojo.Collection;
import com.travel.pojo.User;
import com.travel.service.Impl.CollectionServiceImpl;
import com.travel.service.Impl.UserServiceImpl;

@Controller
@RequestMapping("/collection")
public class CollectionController {

	@RequestMapping("/add")
	@ResponseBody
	public  BigCollection add(int curentPage,HttpServletRequest req){
		UserServiceImpl us=new UserServiceImpl();
		BigCollection bigcollection=new BigCollection();
		CollectionServiceImpl cs=new CollectionServiceImpl();
		//int curent=Integer.valueOf(curentPage).intValue()
		User user=(User) req.getSession().getAttribute("user");
		
		int uid;
		if(user==null){
			uid=0;
		}else{
			uid=user.getUid();
		}
		bigcollection = cs.find(uid,curentPage);
		return bigcollection;
		
	}
}
