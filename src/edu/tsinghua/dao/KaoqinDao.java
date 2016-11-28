package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.Kaoqin;



public class KaoqinDao extends BaseDao{
	
	
	public List<Kaoqin> getPart(Kaoqin kao){
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Kaoqin  k where k.userId like :userId");
		query.setString("title", "%"+kao.getUserId()+"%");
		List<Kaoqin> kaos=query.list();
		return kaos;
	}
	public Kaoqin getOne(Kaoqin kao){
		Kaoqin kaoqin=null;
		Session session=sessionFactory.getCurrentSession();
		kaoqin=(Kaoqin) session.get(Kaoqin.class, kao.getUserId());
		return kaoqin;
	}

	
	/**
	 * 打卡
	 * */

	public void addOne(Kaoqin kao){
		Session session=sessionFactory.getCurrentSession();
		session.save(kao);
		System.out.println("已经打卡");
		
	}
	/**
	 * 查询用户打卡
	 * */
	public List<Kaoqin> getAllDaKa(){
		Session session=sessionFactory.getCurrentSession();
		String hql="from Kaoqin";
		Query query=session.createQuery(hql);
		List<Kaoqin> ulist=query.list();
		return ulist;
	}

}
