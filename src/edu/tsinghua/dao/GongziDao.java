package edu.tsinghua.dao;

import java.util.List;

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
	public void insertOne(List<Gongzi> gongzis){
		Session session=sessionFactory.getCurrentSession();
		for (int i = 0; i < gongzis.size(); i++) {
			session.save(gongzis.get(i));
		}
		System.out.println("提交工资表");
	}
}
