package edu.tsinghua.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.UserBiz;
import edu.tsinghua.entity.LoginInfo;

public class LoginAction extends ActionSupport implements ModelDriven<LoginInfo>{

	/**
	 *  Ù–‘
	 * */
	LoginInfo loginInfo=new LoginInfo();
	UserBiz userBiz;



	public LoginInfo getUser() {
		return loginInfo;
	}



	public void setUser(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}



	public UserBiz getUserBiz() {
		return userBiz;
	}



	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}



	public String login(){
		System.out.println("3");
		LoginInfo u=userBiz.login(loginInfo);
		System.out.println("4");
		if(u==null){
			return LOGIN;
		}
		return SUCCESS;
	}



	@Override
	public LoginInfo getModel() {
		// TODO Auto-generated method stub
		return loginInfo;
	}
	
	
	
	
	
}
