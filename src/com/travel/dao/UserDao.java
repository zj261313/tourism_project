package com.travel.dao;

import javax.servlet.http.HttpServletRequest;

import com.travel.pojo.User;

public interface UserDao {
	/**
	 * �����û�����ѯ�û��Ƿ����
	 * @param user ������û�����
	 * @return  ���ز�ѯ��user�����������Ϣ
	 */
   public  User findUsername(String username);
   
   
   /**
    * ���û���Ϣ��ӵ����ݿ� ��
    * @param user  ������û�����
    * @return  ������������Ƿ�ɹ�
    */
   public int addUser(User user);
  
   /**
    * �ж��������֤�������ɵ���֤���Ƿ�һ��
    * @param check �������֤��
    * @param req 
    * @return  ����true��ʾһ�£�false��ʾ��һ��
    */
   public boolean check(String check,HttpServletRequest req);
   
   /**
    * �ж�������û����������status�Ƿ���ȷ
    * @param user ������û�����
    * @param req 
    * @return   ���ز�ѯ��user�����������Ϣ
    */
   public User login(User user,HttpServletRequest req);
}
