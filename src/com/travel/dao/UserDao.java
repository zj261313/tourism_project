package com.travel.dao;

import javax.servlet.http.HttpServletRequest;

import com.travel.pojo.User;

public interface UserDao {
	/**
	 * 根据用户名查询用户是否存在
	 * @param user 传入的用户对象
	 * @return  返回查询的user对象的所有信息
	 */
   public  User findUsername(String username);
   
   
   /**
    * 把用户信息添加到数据库 中
    * @param user  传入的用户对象
    * @return  返回添加数据是否成功
    */
   public int addUser(User user);
  
   /**
    * 判断输入的验证码与生成的验证码是否一致
    * @param check 输入的验证码
    * @param req 
    * @return  返回true表示一致，false表示不一致
    */
   public boolean check(String check,HttpServletRequest req);
   
   /**
    * 判断输入的用户名和密码和status是否正确
    * @param user 传入的用户对象
    * @param req 
    * @return   返回查询的user对象的所有信息
    */
   public User login(User user,HttpServletRequest req);
}
