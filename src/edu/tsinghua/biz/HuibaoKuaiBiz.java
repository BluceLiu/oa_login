package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.HuibaoKuaiDao;
import edu.tsinghua.entity.HuibaoKuai;

public class HuibaoKuaiBiz {

	HuibaoKuaiDao huibaoKuaiDao;
	
	public HuibaoKuaiDao getHuibaoKuaiDao() {
		return huibaoKuaiDao;
	}

	public void setHuibaoKuaiDao(HuibaoKuaiDao huibaoKuaiDao) {
		this.huibaoKuaiDao = huibaoKuaiDao;
	}

	/**
	 * 提交工作报告 insert
	 */
	public void insertOne(HuibaoKuai huibaoKuai){
		huibaoKuaiDao.insertOne(huibaoKuai);
	}
	
	/**
	 * 查询所有汇报——会计
	 * */
	public List<HuibaoKuai> getAll(){
		return huibaoKuaiDao.getAll();
	}
}
