package edu.tsinghua.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.UserBiz;
import edu.tsinghua.entity.LoginInfo;
import edu.tsinghua.entity.User;

public class LoginAction extends ActionSupport implements SessionAware,ModelDriven<LoginInfo>{

	/**
	 *  Ù–‘
	 * */
	LoginInfo loginInfo=new LoginInfo();
	UserBiz userBiz;
	Map<String, Object> session;


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



/*	public String login(){
		System.out.println("3");
		LoginInfo u=userBiz.login(loginInfo);
		System.out.println("4");
		if(u==null){
			return LOGIN;
		}
		session.put("loginInfo", loginInfo);
		return SUCCESS;
	}*/

	public String login(){
		LoginInfo u=userBiz.login(loginInfo);
		
//		System.out.println("user.getbumenId()="+u.getUserId());
		User user1=userBiz.getuserTypeId(u);
		if(user1!=null){
			if(user1.getUserTypeId()==1){
				System.out.println("user.getzhiweiId()="+user1.getUserTypeId());
				return "success";
			}else if(user1.getUserTypeId()==2){
				return "success2";
				
			}else if(user1.getUserTypeId()==3){
				return "success3";
				
			}else if(user1.getUserTypeId()==4){
				return "success4";
				
			}else if(user1.getUserTypeId()==5){
				return "success5";
			}else{
				return ERROR;
			}
		}
		return ERROR;
		
	}


	@Override
	public LoginInfo getModel() {
		// TODO Auto-generated method stub
		return loginInfo;
	}



	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
	}
	
	
	
	
	
}
