package com.travel.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.pojo.Route;
import com.travel.service.Impl.ChineseServiceImpl;



@Controller 
public class ChineseServlet {
	@RequestMapping("/mostpopular")
	@ResponseBody
	public List<Route> mostpopular(){
		List<Route> mostpopularlist =new ChineseServiceImpl().popularrouteservice();
		return mostpopularlist;
	}
	
	@RequestMapping("/newest")
	@ResponseBody
	public List<Route> newest(){
		List<Route> newestlist =new ChineseServiceImpl().newestrouteservice();
		return newestlist;
	}
	
	@RequestMapping("/theme")
	@ResponseBody
	public List<Route> theme(){
		List<Route> themelist =new ChineseServiceImpl().themerouteservice();
		return themelist;
	}
}
