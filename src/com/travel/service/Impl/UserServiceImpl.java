package com.travel.service.Impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.travel.dao.Impl.UserDaoImpl;
import com.travel.pojo.ResultInfo;
import com.travel.pojo.User;
import com.travel.service.UserService;

public class UserServiceImpl implements UserService {
	UserDaoImpl us = new UserDaoImpl();
	ResultInfo info = new ResultInfo();
	
	public ResultInfo register(User user,String check,HttpServletRequest req) {
		if (us.findUsername(user.getUsername()) != null||us.check(check, req)!=true) {
			// 
			info.setFlag(false);
			System.out.println("输出1");
			//info.setErrorMsg("�û����Ѵ���");
			return info;
		} else {
			if (us.addUser(user) > 0) {
				// ע��ɹ�
				info.setFlag(true);
				info.setErrorMsg("注册成功");
				return info;
			} else {
				// ע��ʧ��
				System.out.println("输出3");
				info.setFlag(false);
				info.setErrorMsg("注册失败");
				return info;
			}
		}
	}

	public ResultInfo findusername(String username){
		User user = us.findUsername(username);
		 if(user!=null){
			 info.setFlag(false);
			 //info.setErrorMsg("�û����Ѵ���");
			 return info;
		 }else{
			 info.setFlag(true);
			 return info;
		 }
	}
	
	
	public ResultInfo check(String check,HttpServletRequest req){
		if(us.check(check, req)!=true){
			info.setFlag(false);
		}   else{
			info.setFlag(true);
		}
		return info;
	}
	
	
	public ResultInfo login(User user ,String check,HttpServletRequest req){
		if(us.check(check, req)!=true){
			info.setFlag(false);
			info.setErrorMsg("验证码错误");
		}else{
			if(us.login(user, req)!=null){
				info.setFlag(true);
			}else{
				info.setFlag(false);
				info.setErrorMsg("请检查账号");
			}
		}
		return info;
	}
}
