package edu.tsinghua.biz;

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
	
}
