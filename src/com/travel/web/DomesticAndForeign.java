package com.travel.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.pojo.Route;
import com.travel.service.Impl.DomesticAndForeignserviceImpl;


@Controller
public class DomesticAndForeign {

	@RequestMapping("/domestic")
	@ResponseBody
	public List<Route> domesticservlet(){
		List<Route> route=new DomesticAndForeignserviceImpl().domesticservice();
		return route;
	}
	
	@RequestMapping("/foreign")
	@ResponseBody
	public List<Route> foreignservlet(){
		List<Route> route=new DomesticAndForeignserviceImpl().foreignservice();
		return route;
	}
}
