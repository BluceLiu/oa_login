package edu.tsinghua.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.HuibaoKuaiBiz;
import edu.tsinghua.entity.HuibaoKuai;
import edu.tsinghua.entity.LoginInfo;

public class HuibaoKuaiAction  extends ActionSupport implements SessionAware,ModelDriven<HuibaoKuai>{

	Map<String, Object> session;
	HuibaoKuai huibaoKuai=new HuibaoKuai();
	HuibaoKuaiBiz huibaoKuaiBiz;
	
	
	/**
	 * 提交工作报告 insert
	 */
	public String insertOne(){
		huibaoKuaiBiz.insertOne(huibaoKuai);
		return SUCCESS;
	}
	/**
	 * 查询所有汇报——会计
	 * */
	public String getAll(){
		List<HuibaoKuai> huibaoKuais=huibaoKuaiBiz.getAll();
		session.put("huibaoKuais", huibaoKuais);
		return SUCCESS;
	}
	
	@Override
	public HuibaoKuai getModel() {
		// TODO Auto-generated method stub
		return huibaoKuai;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
		
	}
	
	public HuibaoKuaiBiz getHuibaoKuaiBiz() {
		return huibaoKuaiBiz;
	}


	public void setHuibaoKuaiBiz(HuibaoKuaiBiz huibaoKuaiBiz) {
		this.huibaoKuaiBiz = huibaoKuaiBiz;
	}


	public Map<String, Object> getSession() {
		return session;
	}
	public HuibaoKuai getHuibaoKuai() {
		return huibaoKuai;
	}
	public void setHuibaoKuai(HuibaoKuai huibaoKuai) {
		this.huibaoKuai = huibaoKuai;
	}
	
	
}
