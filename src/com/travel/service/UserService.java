package com.travel.service;

import javax.servlet.http.HttpServletRequest;

import com.travel.pojo.ResultInfo;
import com.travel.pojo.User;

public interface UserService {
  public ResultInfo register(User user,String check,HttpServletRequest req);
  
  public ResultInfo findusername(String username);
  
  public ResultInfo login(User user ,String check,HttpServletRequest req);
}
