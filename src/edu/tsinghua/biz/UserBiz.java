package edu.tsinghua.biz;

import edu.tsinghua.dao.UserDao;
import edu.tsinghua.entity.LoginInfo;
import edu.tsinghua.entity.User;

public class UserBiz {

	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 登录
	 * */
	public LoginInfo login(LoginInfo user){
		return userDao.login(user);
	}
	
	/**
	 * 查询用户类型
	 * */
	public User getuserTypeId(LoginInfo loginInfo){
		return userDao.getuserTypeId(loginInfo);
	}
}
