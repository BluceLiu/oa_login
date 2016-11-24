package edu.tsinghua.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.GongziBiz;
import edu.tsinghua.biz.HuibaoKuaiBiz;
import edu.tsinghua.entity.Gongzi;
import edu.tsinghua.entity.HuibaoKuai;
import edu.tsinghua.entity.Kaoqin;

public class GongziAction extends ActionSupport implements SessionAware,ModelDriven<Gongzi>{
	
	Map<String, Object> session;
	Gongzi gongzi=new Gongzi();
	HuibaoKuaiBiz huibaoKuaiBiz=new HuibaoKuaiBiz();
	List<Gongzi> gongzis1=new ArrayList<Gongzi>();
	
	GongziBiz gongziBiz;
	
	Gongzi gongzi1=new Gongzi();
	/**
	 * 初始化工资表 insert
	 */
	
	public String init(){
		
		List<HuibaoKuai> huibaoKuais=huibaoKuaiBiz.getAll();
		for (int i = 0; i < huibaoKuais.size(); i++) {
			//避免空指针
			
			gongzis1.add(gongzi1);
			
			//初始化：为工资表gongzis的每一个需要初始化的属性赋值，通过考勤表中属性计算得出需要赋的值
			gongzis1.get(i).setGongziId(huibaoKuais.get(i).getHuibaoKuaiId());
		}
		session.put("gongzibiaos", gongzis1);
		return SUCCESS;
	}
	
	/**
	 * 提交工资表 insert
	 */
	public String insertOne(){
		List<Gongzi> gongzis=
		gongziBiz.insertOne(gongzis);
		return SUCCESS;
	}
	
	@Override
	public Gongzi getModel() {
		// TODO Auto-generated method stub
		return gongzi;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
		
	}
	public Gongzi getGongzi() {
		return gongzi;
	}
	public void setGongzi(Gongzi gongzi) {
		this.gongzi = gongzi;
	}
	public HuibaoKuaiBiz getHuibaoKuaiBiz() {
		return huibaoKuaiBiz;
	}
	public void setHuibaoKuaiBiz(HuibaoKuaiBiz huibaoKuaiBiz) {
		this.huibaoKuaiBiz = huibaoKuaiBiz;
	}
	public List<Gongzi> getGongzis() {
		return gongzis1;
	}
	public void setGongzis(List<Gongzi> gongzis) {
		this.gongzis1 = gongzis;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	public GongziBiz getGongziBiz() {
		return gongziBiz;
	}

	public void setGongziBiz(GongziBiz gongziBiz) {
		this.gongziBiz = gongziBiz;
	}
	
	
}
