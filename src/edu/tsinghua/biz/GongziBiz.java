package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.GongziDao;
import edu.tsinghua.entity.Gongzi;

public class GongziBiz {
	GongziDao gongziDao;
	
	public GongziDao getGongziDao() {
		return gongziDao;
	}

	public void setGongziDao(GongziDao gongziDao) {
		this.gongziDao = gongziDao;
	}

	/**
	 * 初始化工资表 insert
	 */
	
	public void init(Gongzi gongzi){
		gongziDao.init(gongzi);
	}
	
	/**
	 * 提交工资表 insert
	 */
	public void insertOne(List<Gongzi> gongzis){
		gongziDao.insertOne(gongzis);
	}
	
	/**
	 * 删除工资表 
	 */
	public void deleteOne(Gongzi gongzi){
		gongziDao.deleteOne(gongzi);
		
	}
	/**
	 * 修改工资表 
	 */
	public void updateOne(Gongzi gongzi){
		gongziDao.updateOne(gongzi);
	}
	/**
	 * 查看所有工资表 
	 */
	public List<Gongzi> showAll(){
		return gongziDao.showAll();
	}
	
	
}
