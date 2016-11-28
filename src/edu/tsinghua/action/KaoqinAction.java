package edu.tsinghua.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.KaoqinBiz;
import edu.tsinghua.entity.Kaoqin;



public class KaoqinAction extends ActionSupport implements SessionAware,ModelDriven<Kaoqin>{
	KaoqinBiz kaoqinBiz;
	Map<String,Object> session;
	Kaoqin kao=new Kaoqin();
	Kaoqin kaoGet;
	int op=0;
	

	/**
	 * getone
	 * */
	public String getOne(){
		Kaoqin kaoqin=kaoqinBiz.getOne(kao);
		session.put("kao1", kaoqin);
		if(op==1){
			//查看当前
			return "show";
		}else{		
			return SUCCESS;
		}
	}
	
	/**
	 * 打卡
	 * */
	public String addOne(){
		kaoqinBiz.addOne(kao);
		return SUCCESS;
	}
	/**
	 * 查询所有打卡
	 * */
	public String showDaka(){
		
		List<Kaoqin> daKaList=kaoqinBiz.getAllDaKa();
		System.out.println(daKaList);
		if(daKaList!=null){
			session.put("daKaList", daKaList);
			return SUCCESS;
		}
		return "null";
	}
	
	
	
	@Override
	public Kaoqin getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}





	public KaoqinBiz getKaoqinBiz() {
		return kaoqinBiz;
	}





	public void setKaoqinBiz(KaoqinBiz kaoqinBiz) {
		this.kaoqinBiz = kaoqinBiz;
	}





	public Kaoqin getKao() {
		return kao;
	}





	public void setKao(Kaoqin kao) {
		this.kao = kao;
	}





	public Kaoqin getKaoGet() {
		return kaoGet;
	}





	public void setKaoGet(Kaoqin kaoGet) {
		this.kaoGet = kaoGet;
	}





	public int getOp() {
		return op;
	}





	public void setOp(int op) {
		this.op = op;
	}





	public Map<String, Object> getSession() {
		return session;
	}
	
	

}
