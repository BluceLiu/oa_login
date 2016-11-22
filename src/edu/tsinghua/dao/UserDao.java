package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.tsinghua.entity.LoginInfo;

public class UserDao extends BaseDao{
	/**
	 * µÇÂ¼
	 * */
	public LoginInfo login(LoginInfo user){
		Session session=getSession();
		System.out.println("1");
		String hql="from LoginInfo u where u.userId=:uname and u.loginInfoPwd=:upwd";
		Query query=session.createQuery(hql);
		query.setInteger("uname", user.getUserId());
		query.setString("upwd", user.getLoginInfoPwd());
		List<LoginInfo> users=query.list();
		if(users.size()==1){
			user=users.get(0);
		}else{
			user=null;
		}
		System.out.println("2");
		return user;
		
	}
	
	
	
	
	
	

}
