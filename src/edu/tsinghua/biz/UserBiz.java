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
	 * ��¼
	 * */
	public LoginInfo login(LoginInfo user){
		return userDao.login(user);
	}
	
	/**
	 * ��ѯ�û�����
	 * */
	public User getuserTypeId(LoginInfo loginInfo){
		return userDao.getuserTypeId(loginInfo);
	}
}
