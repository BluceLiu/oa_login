package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.tsinghua.entity.LoginInfo;
import edu.tsinghua.entity.User;

public class UserDao extends BaseDao{
	/**
	 * 登录
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
	
	/**
	 * 查询用户类型
	 * */
	public User getuserTypeId(LoginInfo loginInfo){
		Session session=getSession();
		if(loginInfo !=null){
			String hql="from User u where u.userId=:userId";
//		String sql="select * from LoginInfo l,User u where l.userId=u.userId and userId=:userId";
		Query query= session.createQuery(hql);
		query.setInteger("userId", loginInfo.getUserId());
		List<User> users=query.list();
		if(users!=null){
		return users.get(0);
		}else{ 
			return null;
		}
		}else{
			return null;
		}
	}
}
	

	
	


