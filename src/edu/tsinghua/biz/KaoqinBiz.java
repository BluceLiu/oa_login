package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.KaoqinDao;

import edu.tsinghua.entity.Kaoqin;

public class KaoqinBiz {
	KaoqinDao kaoqinDao;

	public KaoqinDao getKaoqinDao() {
		return kaoqinDao;
	}

	public void setKaoqinDao(KaoqinDao kaoqinDao) {
		this.kaoqinDao = kaoqinDao;
	}
	
	public List<Kaoqin> getPart(Kaoqin kao){
		return kaoqinDao.getPart(kao);
	}
	
	public Kaoqin getOne(Kaoqin kao){
		return kaoqinDao.getOne(kao);
	}
	/**
	 * ��
	 * */

	public void addOne(Kaoqin kao){
		kaoqinDao.addOne(kao);
	}
	/**
	 * ��ѯ�û���
	 * */
	public List<Kaoqin> getAllDaKa(){
		return kaoqinDao.getAllDaKa();
	}
}
