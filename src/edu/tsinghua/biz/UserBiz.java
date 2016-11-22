package edu.tsinghua.biz;

import edu.tsinghua.dao.UserDao;
import edu.tsinghua.entity.LoginInfo;

public class UserBiz {

	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * µÇÂ¼
	 * */
	public LoginInfo login(LoginInfo user){
		return userDao.login(user);
	}
	
}
