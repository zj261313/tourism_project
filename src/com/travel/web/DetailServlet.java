package com.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.travel.pojo.Route;
import com.travel.service.Impl.DetailServiceImpl;




@Controller
public class DetailServlet {

	@RequestMapping("/routedetail")
	@ResponseBody
	public Route routedetail(String rid){	
		int id=Integer.valueOf(rid).intValue();
		System.out.println(id);
		Route detailroute=new DetailServiceImpl().detailservice(id);
		return detailroute;
	}
	
}
