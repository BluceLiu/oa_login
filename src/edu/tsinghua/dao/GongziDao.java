package edu.tsinghua.dao;

import org.hibernate.Session;

import edu.tsinghua.entity.Gongzi;
import edu.tsinghua.entity.HuibaoKuai;

public class GongziDao  extends BaseDao{
	
	/**
	 * 初始化工资表 insert
	 */
	public void init(Gongzi gongzi){
		Session session=sessionFactory.getCurrentSession();
		session.save(gongzi);
		System.out.println("初始化");
	}
	
	
	
	/**
	 * 提交工资表 insert
	 */
	public void insertOne(HuibaoKuai huibaoKuai){
		
	}
}
