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
	 * ��ʼ�����ʱ� insert
	 */
	
	public void init(Gongzi gongzi){
		gongziDao.init(gongzi);
	}
	
	/**
	 * �ύ���ʱ� insert
	 */
	public void insertOne(List<Gongzi> gongzis){
		gongziDao.insertOne(gongzis);
	}
	
}
