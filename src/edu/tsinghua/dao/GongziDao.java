package edu.tsinghua.dao;

import java.util.List;

import javax.management.Query;

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
	/**
	 * 删除工资表 
	 */
	public void deleteOne(Gongzi gongzi){
		Session session =sessionFactory.getCurrentSession();
		session.delete(gongzi);
	}
	/**
	 * 修改工资表 
	 */
	public void updateOne(Gongzi gongzi){
		Session session =sessionFactory.getCurrentSession();
		session.update(gongzi);
	}
	/**
	 * 查看所有工资表 
	 */
	public List<Gongzi> showAll(){
		Session session =sessionFactory.getCurrentSession();
		org.hibernate.Query query= session.createQuery("from Gongzi");
		List<Gongzi> gongzis= query.list();
		return gongzis;
	}
	
	
	
}
