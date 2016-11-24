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
	 * �ύ�������� insert
	 */
	public void insertOne(HuibaoKuai huibaoKuai){
		huibaoKuaiDao.insertOne(huibaoKuai);
	}
	
	/**
	 * ��ѯ���л㱨�������
	 * */
	public List<HuibaoKuai> getAll(){
		return huibaoKuaiDao.getAll();
	}
}
