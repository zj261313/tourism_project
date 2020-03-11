package com.travel.dao.Impl;

import com.travel.pojo.User;
import com.travel.utils.JDBCUtils;
import com.travel.utils.MailUtil;
import com.travel.utils.Md5Util;
import com.travel.utils.UuidUtil;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.travel.dao.UserDao;


public class UserDaoImpl implements UserDao {
	
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	@Override
	public  User findUsername(String username) {
		User user=null;
		try {
			user = jt.queryForObject("select * from tab_user where username = ?", new BeanPropertyRowMapper<User>(User.class), username);
		} catch (DataAccessException e) {}
	   return user;
	}
	
	@Override
	public int addUser(User user){
		int len =0;
		try {
			String code = Md5Util.encodeByMd5(UuidUtil.getUuid());
			len= jt.update("insert into tab_user values(null,?,?,?,?,?,?,?,?,?)",user.getUsername(),user.getPassword(),user.getName(),user.getBirthday(),user.getSex(),user.getTelephone(),user.getEmail(),"N",code);
			String content = "<a href ='http://localhost:8080/travel/user/mail?code="+code+"'>点击激活</a>";
	        MailUtil.sendMail(user.getEmail(),content ,"激活邮件" );
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("len��ֵ��"+len);
		return len;
	}
    
	/*public int changestatus(User user){
		int len1=0;
		len1=jt.update("update tab_user set status='Y' where code = ?",user.getCode());
		return len1;
		
	}*/
	
	public boolean check(String check, HttpServletRequest req) {
		String scheck = (String) req.getSession().getAttribute("CHECKCODE_SERVER");
		if (check.equalsIgnoreCase(scheck)) {
			// ��֤��ƥ��
			return true;
		} else {
			// ��֤���������
			return false;
		}
	}
	
	
	public User login(User user,HttpServletRequest req){
		User u = jt.queryForObject("select * from tab_user where username=? and password=? and status='Y'", new BeanPropertyRowMapper<User>(User.class),user.getUsername(),user.getPassword());
	    if(u!=null){
	    	req.getSession().setAttribute("name", u.getName());
	    	req.getSession().setAttribute("uid", u.getUid());
	    	req.getSession().setAttribute("user", u);
	    	
	    	System.out.println();
	    	return u;
	    }else{
	    	return null;
	    }
	    
	}
}
